package com.appdoit.user.commons.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class TaskLocation {
    private String location;
    private String description;
    private String locationType;
    private double totalDistance;
    private double averageTimeDistance;
}
