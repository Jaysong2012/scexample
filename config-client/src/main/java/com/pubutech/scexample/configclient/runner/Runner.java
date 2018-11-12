package com.pubutech.scexample.configclient.runner;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/12
 * @since 1.0
 */
@Component
public class Runner implements ApplicationRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend("spring-boot-exchange","spring-boot", "Hello from RabbitMQ!");
    }
}
