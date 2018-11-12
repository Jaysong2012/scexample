package com.pubutech.scexample.configclient.amqp;

import org.springframework.stereotype.Component;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/12
 * @since 1.0
 */
@Component
public class Receiver {

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

}
