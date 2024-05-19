package com.example.demo.common.mapperproxy;

import org.springframework.beans.factory.FactoryBean;

/**
 * 把mapper注入到spring容器中
 * @param <T>
 */
public class MapperFactoryBean<T> implements FactoryBean {

    //通过这个获取对应的proxyInstance
    private MapperProxyFactory mapperProxyFactory;
    private Class<T> mapperClass;

    public MapperFactoryBean(MapperProxyFactory mapperProxyFactory, Class<T> mapperClass) {
        this.mapperProxyFactory = mapperProxyFactory;
        this.mapperClass = mapperClass;
    }

    @Override
    public  T getObject() throws Exception {
        return mapperProxyFactory.instanceProxyTarget(mapperClass);
    }


    @Override
    public Class<?> getObjectType() {
        return this.mapperClass;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
