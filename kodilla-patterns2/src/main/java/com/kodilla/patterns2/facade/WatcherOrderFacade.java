package com.kodilla.patterns2.facade;

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

}
