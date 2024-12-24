package com.appdoit.user.commons.utils;

import com.appdoit.user.kafka.producer.model.UserRequiredTask;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class KafkaUtils {
    private static String createUuidTask() {
        return UUID.randomUUID().toString();
    }

    public static Record<String, UserRequiredTask> createUniqueTask(UserRequiredTask task) {

        String uuid = createUuidTask();
        task.getRequiredTask().setTaskId(uuid);

        return Record.of(uuid, task);
    }
}
