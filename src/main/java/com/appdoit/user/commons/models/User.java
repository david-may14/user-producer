package com.appdoit.user.producer.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer userId;
    private String userName;
    private Integer age;
    private String gender;
    private boolean ctiveUser;
    private Double rating;
}
