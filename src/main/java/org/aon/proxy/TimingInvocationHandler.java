package org.aon.proxy;

import org.aon.IncDecInterface.IncDec;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimingInvocationHandler implements InvocationHandler {
    private final IncDec target;

    public TimingInvocationHandler(IncDec target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.nanoTime();

        Object result = method.invoke(target, args);

        long endTime = System.nanoTime();
        long durationInMs = (endTime - startTime) / 1_000_000;

        System.out.println("Method " + method.getName() + " executed in " + durationInMs + " ms");

        return result;
    }

}
