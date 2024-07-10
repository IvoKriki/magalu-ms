package com.chalange.magalums.service;

import com.chalange.magalums.dto.SchedulerNotificationDto;
import com.chalange.magalums.repository.NotificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void scheduleNotification(SchedulerNotificationDto dto){
        notificationRepository.save(dto.toNotification());
    }

}
