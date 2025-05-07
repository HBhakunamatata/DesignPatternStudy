package cloud.popples.designpattern.structure.proxy.cglib_proxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @description: 基于cglib的代理工厂
 * @author: Mr.Han
 * @create: 2025-05-04 08:41
 */

public class CglibProxyFactory implements MethodInterceptor {

    private TicketSeller ticketSeller;

    public CglibProxyFactory(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public TicketSeller getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TicketSeller.class);
        enhancer.setCallback(this);
        return (TicketSeller) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
        throws Throwable {
        System.out.println("cglib proxy is working");
        Object result = method.invoke(ticketSeller, objects);
        return result;
    }
}
