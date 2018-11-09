package com.pubutech.scexample.ribbonconsumer.controller;

import com.pubutech.scexample.ribbonconsumer.serviceImpl.RibbonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/8
 * @since 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    RibbonServiceImpl ribbonServiceImpl;

    @Value("${spring.application.name}")
    String applicationName;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return ribbonServiceImpl.hello(name+", from "+applicationName);
    }

}
