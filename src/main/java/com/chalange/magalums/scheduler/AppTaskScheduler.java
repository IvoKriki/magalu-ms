package com.chalange.magalums.scheduler;

import com.chalange.magalums.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class AppTaskScheduler {

    private static final Logger log = LoggerFactory.getLogger(AppTaskScheduler.class);
    private final NotificationService notificationService;

    public AppTaskScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1L, timeUnit = TimeUnit.MINUTES)
    public void runTasks(){
        var dateTime = LocalDateTime.now();
        log.info("Running at {}", dateTime);
        notificationService.checkStatusAndSend(dateTime);
    }

}
