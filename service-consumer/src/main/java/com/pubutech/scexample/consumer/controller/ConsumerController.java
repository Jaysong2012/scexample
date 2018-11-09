package com.pubutech.scexample.consumer.controller;

import com.pubutech.scexample.consumer.service.FeignExampleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/8
 * @since 1.0
 */
@RestController
public class ConsumerController {

    @Value("${spring.application.name}")
    String applicationName;

    @Resource
    private FeignExampleService feignExampleService;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return feignExampleService.hello(name+", from "+applicationName);
    }

}
