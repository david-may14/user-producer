package com.appdoit.user.kafka.producer.model;

import com.appdoit.user.commons.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequiredTask {
    private User user;
    private RequiredTask requiredTask;
}
