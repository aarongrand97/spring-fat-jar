package com.mycompany.app;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Beano {

    @Value("${hello}")
    private String message;

    @Scheduled(fixedRate = 3000)
    public void hello() {
        System.out.println("hello " + message);
    }
}
