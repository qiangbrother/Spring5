package com.jack.spring5.ext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: spring扩展
 * BeanPostProcess:bean后置处理器，bean创建对象初始化前后调用
 * BeanFactoryPostProcess:
 *      beanFactory的后置处理，在BeanFactory标准初始化之后调用，来定制和修改BeanFactory的内容，
 *       所有的bean定义已经保存加载到beanFactory,但是bean的实例还没有创建
 *BeanDefinitionRegistryPostProcessor:
 *      继承BeanFactoryPostProcess,postProcessBeanDefinitionRegistry()方法在所有bean定义信息将要被加载，bean实例还未创建
 *      BeanDefinitionRegistryPostProcessor优先于BeanFactoryPostProcess执行，可以利用BeanDefinitionRegistryPostProcessor给
 *      容器中在额外添加一些组件
 * @Author: zq
 * @Date: 2021/9/6 21:24
 **/
@ComponentScan("com.jack.spring5.ext")
@Configuration
public class ExtConfig {

}
