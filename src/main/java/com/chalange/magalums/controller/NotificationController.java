package com.chalange.magalums.controller;

import com.chalange.magalums.dto.SchedulerNotificationDto;
import com.chalange.magalums.service.NotificationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/notifications")
public class NotificationController {

    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Void> scheduleNotification(@RequestBody SchedulerNotificationDto dto){
        notificationService.scheduleNotification(dto);
        return ResponseEntity.accepted().build();
    }

}
