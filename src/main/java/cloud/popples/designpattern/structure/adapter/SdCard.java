package cloud.popples.designpattern.structure.adapter;

/**
 * @description: SD卡接口
 * @author: Mr.Han
 * @create: 2025-05-04 10:28
 */

public interface SdCard {

    String pullData();

    void pushData(String data);

}
