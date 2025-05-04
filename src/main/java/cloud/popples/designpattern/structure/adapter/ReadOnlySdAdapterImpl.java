package cloud.popples.designpattern.structure.adapter;

/**
 * @description: SD卡只读实现类
 * @author: Mr.Han
 * @create: 2025-05-04 11:11
 */

public class ReadOnlySdAdapterImpl implements ReadOnlySdAdapter{

    private FtCard ftCard;

    public ReadOnlySdAdapterImpl(FtCard ftCard) {
        this.ftCard = ftCard;
    }

    @Override
    public String pullData() {
        return ftCard.getData();
    }
}
