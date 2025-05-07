package cloud.popples.designpattern.structure.adapter;

/**
 * @description: SD卡实现类
 * @author: Mr.Han
 * @create: 2025-05-04 10:29
 */

public class SdCardImpl implements SdCard {

    private String data = "SdCard No.1";

    @Override
    public String pullData() {
        return data;
    }

    @Override
    public void pushData(String data) {
        this.data = data;
    }
}
