package com.huoli.test;

import com.huoli.util.DateUtil;

import java.util.Date;

/**
 * 描述: from eclipse
 * 版权: Copyright (c) 2017
 * 作者: liangkc
 * 版本: 1.0
 * 创建日期: 2017年08月02日
 * 创建时间: 14:50
 */
public class Test {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        newBranch();
        System.out.println(today());
    }
    
    private static String newBranch() {
        System.out.println("Hello,I'm from dev branch!");
        return null;
    }
    
    private static String today() {
        Date date = new Date();
        return DateUtil.getDefaultFormat(date);
    }
}
