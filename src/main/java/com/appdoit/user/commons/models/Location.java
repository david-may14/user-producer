package com.appdoit.user.commons.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Location {
    private double latitude;
    private double longitude;
}
