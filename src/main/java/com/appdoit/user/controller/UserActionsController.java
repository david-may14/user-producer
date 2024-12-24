package com.appdoit.user.producer.controller;

import com.appdoit.user.producer.kafka.KafkaProducerApp;
import com.appdoit.user.commons.utils.KafkaUtils;
import com.appdoit.user.producer.model.requiredtask.UserRequiredTask;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.log4j.Log4j2;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

@Log4j2
@Path("/user-actions")
public class UserActionsController {
    @Inject
    private KafkaProducerApp kafkaProducerApp;

    @POST
    @Path("/send-task")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @RequestBody(description = "Create a new task", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserRequiredTask.class)))
    public void sendTask(UserRequiredTask userRequiredTask) {
        log.info(userRequiredTask);
        kafkaProducerApp.sendTask(KafkaUtils.createUniqueTask(userRequiredTask));
    }

}
