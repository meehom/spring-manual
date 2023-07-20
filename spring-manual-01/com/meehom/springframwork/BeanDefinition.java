package com.meehom.springframwork;

/**
 * @version 1.0
 * @Author meehom
 * @Date 2023/7/20 22:07
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
