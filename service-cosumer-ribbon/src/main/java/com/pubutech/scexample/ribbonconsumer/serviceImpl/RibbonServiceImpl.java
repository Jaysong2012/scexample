package com.pubutech.scexample.ribbonconsumer.serviceImpl;

import com.pubutech.scexample.ribbonconsumer.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/8
 * @since 1.0
 */
@Service
public class RibbonServiceImpl implements ExampleService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hello(String name) {
        return restTemplate.getForObject("http://service-producer/hello?name="+name,String.class);
    }
}
