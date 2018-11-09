package com.pubutech.scexample.consumer.hystrix;

import com.pubutech.scexample.consumer.service.FeignExampleService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/8
 * @since 1.0
 */
@Component
public class FeignServiceHystrix implements FeignExampleService {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "sorry "+name+"，service has fail!";
    }
}
