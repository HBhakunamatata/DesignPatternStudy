package cloud.popples.designpattern.structure.adapter;

/**
 * @description: 电脑接口类
 * @author: Mr.Han
 * @create: 2025-05-04 10:36
 */

public class Computer {

    private SdCard sdCard;

    private SdCard readOnlySdCard;

    public Computer(SdCard sdCard, SdCard readOnlySdCard) {
        this.sdCard = sdCard;
        this.readOnlySdCard = readOnlySdCard;
    }

    public String readSdCard() {
        if (sdCard == null) {
            throw new NullPointerException("sdCard is null");
        }
        return sdCard.pullData();
    }

    public void writeSdCard(String data) {
        if (sdCard == null) {
            throw new NullPointerException("sdCard is null");
        }
        sdCard.pushData(data);
    }

    public String readFromReadOnlySdCard() {
        if (readOnlySdCard == null) {
            throw new NullPointerException("readOnlySdCard is null");
        }
        return readOnlySdCard.pullData();
    }

    public void writeFromReadOnlySdCard(String data) {
        if (readOnlySdCard == null) {
            throw new NullPointerException("readOnlySdCard is null");
        }
        readOnlySdCard.pushData(data);
    }

}
