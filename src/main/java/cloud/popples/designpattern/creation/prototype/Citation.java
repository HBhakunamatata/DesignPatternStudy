package cloud.popples.designpattern.creation.prototype;

/**
 * @description: 奖状类
 * @author: Mr.Han
 * @create: 2025-05-03 10:04
 */

public class Citation implements Cloneable {

    private String name;

    public Citation() {}

    public Citation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

}
