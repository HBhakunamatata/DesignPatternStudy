package cloud.popples.designpattern.creation.prototype;

/**
 * @description: 奖状类深拷贝版
 * @author: Mr.Han
 * @create: 2025-05-03 12:15
 */

public class CitationEnh1 implements Cloneable {

    private Awardee awardee;

    public CitationEnh1() {}

    public String getAwardeeName() {
        return awardee.getName();
    }

    public void setAwardeeName(String awardeeName) {
        awardee.setName(awardeeName);
    }

    public void setAwardee(Awardee awardee) {
        this.awardee = awardee;
    }

    public CitationEnh1 clone() throws CloneNotSupportedException {
        return (CitationEnh1) super.clone();
    }

}
