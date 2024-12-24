package com.appdoit.user.kafka.consumer.model;

import com.appdoit.user.commons.models.Tasker;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class TaskerAssigned {
    private Tasker tasker;
    private String assignationCode;
}
