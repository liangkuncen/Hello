package com.huoli.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 描述: TODO 类描述
 * 版权: Copyright (c) 2017
 * 作者: liangkc
 * 版本: 1.0
 * 创建日期: 2017年08月02日
 * 创建时间: 14:50
 */
public class Test {
    
    private static final Logger logger = LoggerFactory.getLogger(Test.class);
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        logger.warn("this is log!");
    }
}
