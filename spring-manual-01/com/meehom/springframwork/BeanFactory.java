package com.meehom.springframwork;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author meehom
 * @Date 2023/7/20 22:06
 * @version 1.0
 */
public class BeanFactory {
    private Map<String, com.meehom.springframwork.BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, com.meehom.springframwork.BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
