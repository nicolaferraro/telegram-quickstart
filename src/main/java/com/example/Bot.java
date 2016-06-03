package com.example;

import org.springframework.stereotype.Component;

/**
 * This class contains the chat-bot logic: use your fantasy to implement your own Bot.
 */
@Component
public class Bot {

    /**
     * This method processes incoming messages and return responses.
     *
     * @param message a message coming from a human user in a chat
     * @return the reply of the bot. Return null if you don't want to answer
     */
    public String process(String message) {
        if (message == null) {
            return null; // skip non-text messages
        }

        return "Why did you say \"" + message.replace("\"", "-") + "\"?";
    }

}
