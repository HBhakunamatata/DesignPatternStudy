package cloud.popples.designpattern.structure.adapter;

/**
 * @description: 只读卡接口
 * @author: Mr.Han
 * @create: 2025-05-04 10:43
 */

public interface ReadOnlySdAdapter extends SdCard {

    String pullData();

    default void pushData(String data) {
        throw new UnsupportedOperationException("Not supported for writing data");
    }


}
