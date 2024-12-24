package com.appdoit.user.producer.model.requiredtask;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TaskLocation {
    private String location;
    private String description;
    private String locationType;
    private double totalDistance;
    private double averageTimeDistance;
}
