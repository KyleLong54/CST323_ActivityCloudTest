package com.gcu.util;

import java.util.Date;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.interceptor.AbstractMonitoringInterceptor;
import org.apache.commons.logging.Log;

public class Tracer extends AbstractMonitoringInterceptor {

    private static final long serialVersionUID = -5378974652504403928L;

    public Tracer() {
    } // end Constructor

    public Tracer(boolean useDynamicLogger) {
        setUseDynamicLogger(useDynamicLogger);
    } // end non-default Constructor

    @Override
    protected Object invokeUnderTrace(MethodInvocation invocation, Log log) throws Throwable {
        // Before method invocation display start method trace log statement
        String name = createInvocationTraceName(invocation);
        long start = System.currentTimeMillis();
        log.trace("GCU Method " + name + " execution started at:" + new Date());

        try {
            // Invoke the method
            return invocation.proceed();
        } finally {
            // After method display an end method trace log statement
            long end = System.currentTimeMillis();
            long time = end - start;
            log.trace("GCU Method " + name + " execution lasted:" + time + " ms");
            log.trace("GCU Method " + name + " execution ended at:" + new Date());
            if (time > 10) {
                log.warn("GCU Method execution longer than 10 ms!");
            } // end if
        } // end try
    } // end invokeUnderTrace
    
} // end Tracer
