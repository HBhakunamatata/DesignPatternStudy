package cloud.popples.designpattern.creation.builder;

import cloud.popples.designpattern.creation.builder.bike.Bike;
import cloud.popples.designpattern.creation.builder.phone.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 建设者模式测试类
 * @author: Mr.Han
 * @create: 2025-05-03 16:44
 */

public class BuilderTest {

    @Test
    void testBikeBuilder() {
        Director director = new Director(new OfoBikeBuilder());
        Bike ofoBike = director.construct();
        Assertions.assertEquals("There is a bike. It has Al frame and feather seat\n", ofoBike.show());
    }

    @Test
    void testBuildPhone() {
        Phone phone = new Phone.Builder()
            .cpu("intel")
            .memory("Kington")
            .screen("sumsam")
            .type("apple")
            .build();
        Assertions.assertNotNull(phone);
    }

}
