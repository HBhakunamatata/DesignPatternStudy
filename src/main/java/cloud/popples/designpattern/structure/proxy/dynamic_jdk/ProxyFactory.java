package cloud.popples.designpattern.structure.proxy.dynamic_jdk;

import cloud.popples.designpattern.structure.proxy.SellTicket;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 动态代理工厂类
 * @author: Mr.Han
 * @create: 2025-05-03 21:45
 */

public class ProxyFactory {

    private final SellTicket realSubject;

    public ProxyFactory(SellTicket realSubject) {
        this.realSubject = realSubject;
    }

    public SellTicket getProxy() {
        return (SellTicket) Proxy.newProxyInstance(
            realSubject.getClass().getClassLoader(),
            new Class[]{SellTicket.class},
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("Sell ticket toward selling pointer");
                    return method.invoke(realSubject, args);
                }
            }
        );
    }

}
