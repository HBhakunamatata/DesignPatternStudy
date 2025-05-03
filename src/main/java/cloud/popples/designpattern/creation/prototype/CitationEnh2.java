package cloud.popples.designpattern.creation.prototype;

import com.google.gson.Gson;
import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;

/**
 * @description: 实现深拷贝的奖状类
 * @author: Mr.Han
 * @create: 2025-05-03 13:21
 */

public class CitationEnh2 implements Serializable {

    private Awardee awardee;

    public CitationEnh2() {
    }

    public void setAwardee(final Awardee awardee) {
        this.awardee = awardee;
    }

    public String getAwardeeName() {
        return awardee.getName();
    }

    public void setAwardeeName(final String awardeeName) {
        awardee.setName(awardeeName);
    }


    public CitationEnh2 serializeCopy() {
        return SerializationUtils.clone(this);
    }

    public CitationEnh2 jsonCopy() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return gson.fromJson(json, CitationEnh2.class);
    }

}
