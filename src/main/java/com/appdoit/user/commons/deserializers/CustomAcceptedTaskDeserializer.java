package com.appdoit.user.commons.deserializers;

import com.appdoit.user.kafka.consumer.model.AcceptedTask;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class CustomAcceptedTaskDeserializer extends ObjectMapperDeserializer<AcceptedTask> {
    public CustomAcceptedTaskDeserializer() {
        super(AcceptedTask.class);
    }
}