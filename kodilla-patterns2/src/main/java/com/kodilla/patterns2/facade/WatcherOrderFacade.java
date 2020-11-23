package com.kodilla.patterns2.facade;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
public class WatcherOrderFacade {
    private final static List<String> logs = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOrderFacade.class);


    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("ProcessOrder method was executed");
    }
    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object saveLogEvent(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;

        try {
            result = proceedingJoinPoint.proceed();
            LOGGER.info("Logging around the event");

        } catch (Throwable throwable){
            logs.add(throwable.getMessage());
            throw throwable;
        }
        finally {
            System.out.println("The saved logs: ");
            for (String log:logs) {
                System.out.println(log);
            }
        }
        return result;
    }

}
