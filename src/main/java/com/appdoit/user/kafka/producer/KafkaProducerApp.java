package com.appdoit.user.kafka.producer;

import com.appdoit.user.kafka.producer.model.UserRequiredTask;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.log4j.Log4j2;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
@Log4j2
public class KafkaProducerApp {
    @Inject
    @Channel("task-creation-producer")
    private Emitter<Record<String, UserRequiredTask>> emitter;



    public void sendTask(Record<String, UserRequiredTask> recordValue) {
        try {
            emitter.send(recordValue);
        } catch (Exception e) {
            log.error(e);
        }
    }


}
