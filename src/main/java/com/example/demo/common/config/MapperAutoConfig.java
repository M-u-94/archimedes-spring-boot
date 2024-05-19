package com.example.demo.common.config;

import com.example.demo.common.mapperproxy.MapperCommonCore;
import com.example.demo.common.mapperproxy.MapperFactoryBean;
import com.example.demo.common.mapperproxy.MapperProxyFactory;
import com.example.demo.mapper.IMyMapperA;
import com.example.demo.mapper.IMyMapperB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 加载mapper xml文件和mapper接口，是mapper初始化的总入口
 */
@Slf4j
@Component
public class MapperAutoConfig {

    public MapperAutoConfig(ConfigurableListableBeanFactory beanFactory){
        log.info("开始初始化mapper...");
        MapperProxyFactory mapperProxyFactory = new MapperProxyFactory(new MapperCommonCore());
        beanFactory.registerSingleton("myMapperA",new MapperFactoryBean(mapperProxyFactory, IMyMapperA.class));
        beanFactory.registerSingleton("myMapperB",new MapperFactoryBean(mapperProxyFactory, IMyMapperB.class));
    }


}
