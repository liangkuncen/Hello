package com.huoli.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述: dateutil工具类
 * 版权: Copyright (c) 2017
 * 作者: liangkc
 * 版本: 1.0
 * 创建日期: 2017年08月02日
 * 创建时间: 15:27
 */
public class DateUtil {
    
    
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd";
    
    public static String getDefaultFormat(Date date) {
        return format(date, DEFAULT_FORMAT);
    }
    
    public static String format(Date date, String formatStr) {
        if (StringUtil.isNull(formatStr)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
    }
}
