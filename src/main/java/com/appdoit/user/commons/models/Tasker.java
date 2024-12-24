package com.appdoit.user.producer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tasker {
    private int id;
    private String name;
    private String email;
    private String phone;
    private Double rating;

}
