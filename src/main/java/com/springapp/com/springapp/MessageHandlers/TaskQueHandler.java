package com.springapp.com.springapp.MessageHandlers;

import com.springapp.models.textMessage;
import org.springframework.amqp.core.Message;

/**
 * Created by madhawa on 2/25/16.
 */
public class TaskQueHandler {
    public void handleMessage(textMessage message) {
        System.out.println("message listener is being executed");
        System.out.println("received message is "+message);
        System.out.println("id "+message.getId());
        System.out.println("description "+message.getDescription());
        System.out.println("operation "+message.getOperation());
    }
}
