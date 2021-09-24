package com.jack.spring5.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description:监听容器发布的事件，事件驱动模型开发
 * @Author: zq
 * @Date: 2021/9/15 21:23
 **/
@Component
public class MyApplicationListener implements ApplicationListener {

    /**
     * 当容器中发布此事件以后，反法触发
     * @param applicationEvent
     */
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到事件"+applicationEvent);
    }
}
