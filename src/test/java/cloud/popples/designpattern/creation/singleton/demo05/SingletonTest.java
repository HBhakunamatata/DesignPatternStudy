package cloud.popples.designpattern.creation.singleton.demo05;

import cloud.popples.designpattern.creation.singleton.demo05.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 懒汉单例-线程安全-测试类
 * @author: Mr.Han
 * @create: 2025-05-01 14:38
 */

public class SingletonTest {

    @Test
    void testTwoSingletonInstanceEqualsThenReturnTrue()
        throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Singleton>> results = executorService.invokeAll(taskList());
        Singleton thisOne = results.get(0).get();
        results.forEach(i -> {
            try {
                Assertions.assertSame(thisOne, i.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private List<Callable<Singleton>> taskList() {
        List<Callable<Singleton>> runnableList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            runnableList.add(Singleton::getInstance);
        }
        return runnableList;
    }

}
