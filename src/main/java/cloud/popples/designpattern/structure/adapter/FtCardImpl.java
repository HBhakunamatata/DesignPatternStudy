package cloud.popples.designpattern.structure.adapter;

/**
 * @description: FT卡实现类
 * @author: Mr.Han
 * @create: 2025-05-04 10:33
 */

public class FtCardImpl implements FtCard {

    private String data = "FT Card No.1";

    @Override
    public void putData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}
