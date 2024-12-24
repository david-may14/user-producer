package com.appdoit.user.consumer.kafka;

import com.appdoit.user.consumer.acceptedtask.AcceptedTask;
import io.smallrye.reactive.messaging.annotations.Blocking;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.log4j.Log4j2;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
@Log4j2
public class KafkaConsumerApp {
    @Incoming("taks-accepted-consumer")
    @Blocking
    public void getAcceptedTask(AcceptedTask acceptedTask) {
        log.info("AcceptedTask: {}", acceptedTask);
    }
}
