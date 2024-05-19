package com.example.demo.common.mapperproxy;

import java.lang.reflect.Proxy;

/**
 * 创建mapper代理类的工厂
 */
public class MapperProxyFactory {

    private MapperCommonCore mapperCommonCore;


    public MapperProxyFactory(MapperCommonCore mapperCommonCore) {
       this.mapperCommonCore = mapperCommonCore;
    }

    /**
     * 创建代理类
     * @param mapperClass
     * @return
     */
    public MapperProxy getProxy(Class mapperClass){
       return new MapperProxy(mapperCommonCore,mapperClass);
    }

    /**
     * 实例化代理类
     * @param mapperClass
     * @return
     * @param <T>
     */
    public <T> T instanceProxyTarget(Class<T> mapperClass){
        MapperProxy proxy = getProxy(mapperClass);
        return (T) Proxy.newProxyInstance(mapperClass.getClassLoader(), new Class[]{mapperClass}, proxy);
    }






}
