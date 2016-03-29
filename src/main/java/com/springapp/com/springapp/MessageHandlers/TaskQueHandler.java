package com.springapp.com.springapp.MessageHandlers;

import com.springapp.models.textMessage;
import org.springframework.amqp.core.Message;

/**
 * Created by madhawa on 2/25/16.
 */
public class TaskQueHandler {
    public void handleMessage(textMessage message) {
        System.out.println("------------New Message Received--------------------------");
        System.out.println("id           :- "+message.getId());
        System.out.println("description  :- "+message.getDescription());
        System.out.println("operation    :- "+message.getOperation());
        System.out.println("------------End of New Message--------------------------");
    }
}
