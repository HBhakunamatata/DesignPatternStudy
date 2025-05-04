package cloud.popples.designpattern.structure.proxy.static_proxy;

import cloud.popples.designpattern.structure.proxy.SellTicket;
import cloud.popples.designpattern.structure.proxy.TrainStation;

/**
 * @description: 火车票代售点-静态代理实现
 * @author: Mr.Han
 * @create: 2025-05-03 21:37
 */

public class StaticProxyPointer implements SellTicket {

    private SellTicket realSubject;

    public StaticProxyPointer(SellTicket realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void sell() {
        System.out.println("Sell ticket in selling pointer");
        realSubject.sell();
    }
}
