package com.example.demo.common.mapperproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 核心，类似sqlsession
 */
@Slf4j
public class MapperCommonCore {
    public void doSth(Class mapperClass,String mapperMethod){
        log.info("希望执行mapper-{}的{}方法，我将通过命令模式来驱动真正的能力实现",mapperClass,mapperMethod);
    }
}
