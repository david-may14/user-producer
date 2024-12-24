package com.appdoit.user.consumer.acceptedtask;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RequestedTask {
    /**
     * This class holds the information provided by the task processing service
     * describing the details of the required task by the user. This must hold all
     * the details involved to complete the task, e.g. tasker information, distance,
     * price, time to completion
     */
    private Integer requestedTaskId;
    private String requestStatus;
    private String description;
    private String notes;

}
