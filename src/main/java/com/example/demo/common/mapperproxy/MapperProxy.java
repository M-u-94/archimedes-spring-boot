package com.example.demo.common.mapperproxy;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * mapper cglib动态代理
 */
@Slf4j
@Getter
public class MapperProxy implements InvocationHandler {

    private MapperCommonCore target;
    private Class mapperClass;

    public MapperProxy(MapperCommonCore target,Class mapperClass) {
        this.target = target;
        this.mapperClass = mapperClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Object类的放不执行代理
        if(!Object.class.equals(method.getDeclaringClass())){
            log.info("准备执行mapper的{}方法",method.getName());
            this.target.doSth(mapperClass,method.getName());
            // TODO: 2024/5/19 void方法应该返回什么？
            return null;
        }
        return method.invoke(proxy,args);
    }
}
