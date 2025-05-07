package cloud.popples.designpattern.structure.proxy;

/**
 * @description: 火车站类
 * @author: Mr.Han
 * @create: 2025-05-03 21:32
 */

public class TrainStation implements SellTicket{

    @Override
    public void sell() {
        System.out.println("TrainStation sold a ticket");
    }
}
