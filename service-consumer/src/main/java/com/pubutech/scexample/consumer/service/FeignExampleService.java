package com.pubutech.scexample.consumer.service;

import com.pubutech.scexample.consumer.hystrix.FeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author SongChao
 * @version 1.0
 * @website https://github.com/Jaysong2012
 * @date 2018/11/8
 * @since 1.0
 */

@FeignClient(value = "service-producer",fallback = FeignServiceHystrix.class)
public interface FeignExampleService {

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name") String name);

}
