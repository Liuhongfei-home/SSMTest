package com.fc.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        // 默认支持的日期格式
        String format = "yyyy/MM/dd";

        // 如果日期格式中包含 -，替换默认的格式
        if (source.contains("-")) {
            format = "yyyy-MM-dd";
        }

        // 创建一个简单的日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        Date parse = null;

        try {
            parse = simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return parse;
    }
}
