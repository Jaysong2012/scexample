package com.pubutech.scexample.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/8
 * @since 1.0
 */
@RestController
public class ProducerController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，this is new world";
    }

}
