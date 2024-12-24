package com.appdoit.user.consumer.acceptedtask;

import com.appdoit.user.commons.models.TaskLocation;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AcceptedTask {
    private RequestedTask requiredTask;
    private TaskerAssigned tasker;
    private Pricing price;
    private TaskLocation location;

}
