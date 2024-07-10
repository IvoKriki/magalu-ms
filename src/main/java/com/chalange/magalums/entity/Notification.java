package com.chalange.magalums.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationId;
    private LocalDateTime dateTime;
    private String destination;
    private String message;
    public Notification(LocalDateTime dateTime, String destination, String message, Channel channel, Status status) {
    }

    @ManyToOne
    @JoinColumn(name = "channel_id")
    private Channel channel;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

}
