package com.huoli.util;


/**
 * 描述: String工具类
 * 版权: Copyright (c) 2017
 * 作者: liangkc
 * 版本: 1.0
 * 创建日期: 2017年08月02日
 * 创建时间: 15:32
 */
public class StringUtil {
    
    
    public static boolean isNull(String str) {
        return str == null || str.trim().length() == 0;
    }
}
