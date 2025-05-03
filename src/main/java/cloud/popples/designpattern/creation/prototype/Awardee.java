package cloud.popples.designpattern.creation.prototype;

import java.io.Serializable;

/**
 * @description: 获奖者
 * @author: Mr.Han
 * @create: 2025-05-03 12:01
 */

public class Awardee implements Serializable {

    private String name;

    public Awardee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
