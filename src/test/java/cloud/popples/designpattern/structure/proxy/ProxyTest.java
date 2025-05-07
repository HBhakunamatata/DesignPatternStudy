package cloud.popples.designpattern.structure.proxy;

import cloud.popples.designpattern.structure.proxy.cglib_proxy.CglibProxyFactory;
import cloud.popples.designpattern.structure.proxy.cglib_proxy.TicketSeller;
import cloud.popples.designpattern.structure.proxy.dynamic_jdk.ProxyFactory;
import cloud.popples.designpattern.structure.proxy.static_proxy.StaticProxyPointer;
import org.junit.jupiter.api.Test;

/**
 * @description: 静态代理测试类
 * @author: Mr.Han
 * @create: 2025-05-03 21:42
 */

public class ProxyTest {

    @Test
    void testStaticProxy() {
        SellTicket realSubject = new TrainStation();
        StaticProxyPointer pointer = new StaticProxyPointer(realSubject);
        pointer.sell();
    }

    @Test
    void testDynamicJdkProxy() {
        SellTicket realSubject = new TrainStation();
        ProxyFactory factory = new ProxyFactory(realSubject);
        SellTicket proxy = factory.getProxy();
        proxy.sell();
    }

    @Test
    void testDynamicCglibProxy() {
        TicketSeller ticketSeller = new TicketSeller();
        CglibProxyFactory factory = new CglibProxyFactory(ticketSeller);
        TicketSeller proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }

}
