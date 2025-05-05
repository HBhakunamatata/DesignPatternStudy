package cloud.popples.designpattern.structure.facade;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @description: 外观模式测试类
 * @author: Mr.Han
 * @create: 2025-05-05 10:07
 */

public class FacadeTest {

    HomeAssistantFacade facade = new HomeAssistantFacade();

    @Test
    void testTurnOnAll() throws Exception {
        String outText = tapSystemOut(() -> facade.voiceControl("on"));
        Assertions.assertEquals("ON,ON", outText);
    }

    @Test
    void testTurnOffAll() throws Exception {
        String outText = tapSystemOut(() -> facade.voiceControl("off"));
        Assertions.assertEquals("OFF,OFF", outText);
    }

    @Test
    void testNotUnderstanding() throws Exception {
        String outText = tapSystemOut(() -> facade.voiceControl("fer"));
        Assertions.assertEquals("Not understanding...", outText);
    }

}
