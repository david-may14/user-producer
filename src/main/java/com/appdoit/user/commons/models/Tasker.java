package com.appdoit.user.commons.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Tasker {
    private int id;
    private String name;
    private String email;
    private String phone;
    private Double rating;

}
