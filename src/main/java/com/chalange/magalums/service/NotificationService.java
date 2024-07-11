package com.chalange.magalums.service;

import com.chalange.magalums.dto.SchedulerNotificationDto;
import com.chalange.magalums.entity.Notification;
import com.chalange.magalums.repository.NotificationRepository;
import lombok.AllArgsConstructor;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(SchedulerNotificationDto dto){
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId){
        return notificationRepository.findById(notificationId);
    }

}
