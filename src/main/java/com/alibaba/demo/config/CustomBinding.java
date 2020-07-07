package com.alibaba.demo.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface CustomBinding {
    public static final String CUSTOMOUTPUT = "custom_output";

    @Output(CustomBinding.CUSTOMOUTPUT)
    MessageChannel tradeddetail_output();
}
