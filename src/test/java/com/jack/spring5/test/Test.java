package com.jack.spring5.test;


import com.jack.spring5.ext.ExtConfig;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: zq
 * @Date: 2021/9/15 20:55
 **/
public class Test {

    @org.junit.jupiter.api.Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        int beanDefinitionCount = annotationConfigApplicationContext.getBeanDefinitionCount();
        annotationConfigApplicationContext.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
        });
    }
}
