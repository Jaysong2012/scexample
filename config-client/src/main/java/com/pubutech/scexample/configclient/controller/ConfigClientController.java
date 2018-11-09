package com.pubutech.scexample.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/9
 * @since 1.0
 */
@RestController
public class ConfigClientController {

    @Value("${writer}")
    String writer;

    @RequestMapping(value = "/writer")
    public String writer(){
        return writer;
    }

}
