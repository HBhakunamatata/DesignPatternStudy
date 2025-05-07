package cloud.popples.designpattern.structure.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 适配器模式测试类
 * @author: Mr.Han
 * @create: 2025-05-04 10:39
 */

public class AdapterTest {

    String testData = "test data";

    @Test
    void testReadWriteAdapter() {
        FtCard ftCard = new FtCardImpl();
        ReadWriteSdAdapter readWriteAdapter = new ReadWriteSdAdapter(ftCard);
        Computer computer = new Computer(readWriteAdapter, null);
        computer.writeSdCard(testData);
        Assertions.assertEquals(testData, computer.readSdCard());
    }

    @Test
    void testReadOnlyAdapter() {
        FtCard ftCard = new FtCardImpl();
        ReadOnlySdAdapter readOnlySdAdapter = new ReadOnlySdAdapterImpl(ftCard);
        Computer computer = new Computer(null, readOnlySdAdapter);
        Assertions.assertEquals("FT Card No.1", computer.readFromReadOnlySdCard());
        Assertions.assertThrows(
            UnsupportedOperationException.class,
            () -> computer.writeFromReadOnlySdCard(testData)
        );
    }


}
