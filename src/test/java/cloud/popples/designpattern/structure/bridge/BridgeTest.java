package cloud.popples.designpattern.structure.bridge;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 桥接模式测试类
 * @author: Mr.Han
 * @create: 2025-05-04 19:38
 */

public class BridgeTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    void testOperatorPlayVideoFile() throws Exception {
        VideoFile aviFile = new AviFile();
        OperatorSystem mac = new MacOperatorSystem(aviFile);
        String text = tapSystemOut(() -> {
            mac.play("xika");
        });
        Assertions.assertEquals("Playing xika.avi", text.trim());
    }

}
