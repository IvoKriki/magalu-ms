package com.chalange.magalums.dto;

import com.chalange.magalums.entity.Channel;
import com.chalange.magalums.entity.Notification;
import com.chalange.magalums.entity.Status;

import java.time.LocalDateTime;

public record SchedulerNotificationDto(LocalDateTime dateTime,
                                       String destination,
                                       String message,
                                       Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus());
    }
}
