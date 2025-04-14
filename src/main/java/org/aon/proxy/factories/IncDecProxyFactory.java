package org.aon.proxy.factories;

import org.aon.IncDecInterface.IncDec;
import org.aon.proxy.TimingInvocationHandler;

import java.lang.reflect.Proxy;

public class IncDecProxyFactory {
    public static IncDec createProxy(IncDec target) {
        return (IncDec) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                new Class[]{IncDec.class},
                new TimingInvocationHandler(target)
        );
    }
}

