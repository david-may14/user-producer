package com.appdoit.user.commons.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private Integer userId;
    private String userName;
    private Integer age;
    private String gender;
    private boolean activeUser;
    private Double rating;
}
