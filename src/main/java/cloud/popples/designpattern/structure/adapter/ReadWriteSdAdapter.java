package cloud.popples.designpattern.structure.adapter;

/**
 * @description: 支持读写的适配器
 * @author: Mr.Han
 * @create: 2025-05-04 10:34
 */

public class ReadWriteSdAdapter implements SdCard {

    private FtCard ftCard;

    public ReadWriteSdAdapter(FtCard ftCard) {
        this.ftCard = ftCard;
    }

    @Override
    public String pullData() {
        return ftCard.getData();
    }

    @Override
    public void pushData(String data) {
        ftCard.putData(data);
    }
}
