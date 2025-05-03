package cloud.popples.designpattern.creation.prototype;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 原型模式测试类
 * @author: Mr.Han
 * @create: 2025-05-03 10:07
 */

public class PrototypeTest {

    @Test
    void whenCloneCitationThenReturnTrue() throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation cloned = citation.clone();
        citation.setName("Amy");
        cloned.setName("Bob");
        Assertions.assertNotSame(citation, cloned);
    }


    @Test
    @SneakyThrows
    void testCopyDeepObjectThenReturnFail() {
        Awardee amy = new Awardee("Amy");

        CitationEnh1 citation = new CitationEnh1();
        citation.setAwardee(amy);

        CitationEnh1 clone = citation.clone();
        clone.setAwardeeName("Bob");

        Assertions.assertEquals("Bob", clone.getAwardeeName());
        Assertions.
            assertNotEquals("Amy", citation.getAwardeeName());
        Assertions.assertEquals("Bob", citation.getAwardeeName());
    }

    @Test
    @SneakyThrows
    void testDeepCopyWithSerializeThenReturnTrue() {
        Awardee amy = new Awardee("Amy");

        CitationEnh2 citation = new CitationEnh2();
        citation.setAwardee(amy);

        CitationEnh2 clone = citation.serializeCopy();
        clone.setAwardeeName("Bob");

        Assertions.assertEquals("Bob", clone.getAwardeeName());
        Assertions.assertEquals("Amy", citation.getAwardeeName());
    }

    @Test
    @SneakyThrows
    void testDeepCopyWithJsonThenReturnTrue() {
        Awardee amy = new Awardee("Amy");

        CitationEnh2 citation = new CitationEnh2();
        citation.setAwardee(amy);

        CitationEnh2 clone = citation.jsonCopy();
        clone.setAwardeeName("Bob");

        Assertions.assertEquals("Bob", clone.getAwardeeName());
        Assertions.assertEquals("Amy", citation.getAwardeeName());
    }
}
