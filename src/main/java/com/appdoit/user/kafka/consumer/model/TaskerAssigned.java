package com.appdoit.user.consumer.acceptedtask;

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
