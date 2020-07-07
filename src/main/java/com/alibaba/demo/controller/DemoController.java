package com.alibaba.demo.controller;

import com.alibaba.demo.config.CustomBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Resource
    CustomBinding customBinding;

    @RequestMapping("/testsend")
    public String testSend() {
        customBinding.tradeddetail_output().send(MessageBuilder.withPayload("test").build());
        return "发送";
    }

}
