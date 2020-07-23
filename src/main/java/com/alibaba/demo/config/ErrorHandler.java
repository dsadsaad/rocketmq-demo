package com.alibaba.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ErrorHandler {

    //硬编码 正常捕获
    //但无法捕获所有发送的异常
    //与LoggingHandler 平均分摊异常消息
    @ServiceActivator(inputChannel = "MQ_INST_123123_Bcw0lhYs%test-topic.test-group1.errors")
    public void error1(MessagingException message) {
        log.warn("捕获异常 Handling ERROR: " + message.getFailedMessage().getPayload());
    }

   //参考官方文档 无法捕获
   //@ServiceActivator(inputChannel = CustomBinding.CUSTOMOUTPUT+".errors")
   //public void error2(MessagingException message) {
   //     log.warn("捕获异常 Handling ERROR: " + message.getFailedMessage().getPayload());
   // }

    //SPEL无法捕获
    //@ServiceActivator(inputChannel ="${spring.cloud.stream.bindings."+CustomBinding.CUSTOMOUTPUT+".errors")
    //public void error3(MessagingException message) {
    //    log.warn("捕获异常 Handling ERROR: " + message.getFailedMessage().getPayload());
    //}
}
