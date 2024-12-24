package com.appdoit.user.kafka.producer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequiredTask {
    /**
     * This class is intended to have the data from the task required by the user
     * at the moment of the request no tasker has been assigned but the details
     * of the task must be described
     */
    private String taskId;
    private String taskOperation;
    private String taskDescription;
    private String taskStatus;
    private String taskType;
    // private TaskLocation taskLocation;

}
