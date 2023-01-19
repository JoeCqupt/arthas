package com.taobao.arthas.core.env.convert;

import com.taobao.arthas.core.util.NumberUtils;

public class NumberToNumberConverter implements Converter<Number, Number>{
    @Override
    public Number convert(Number source, Class<Number> targetType) {
        return NumberUtils.convertNumberToTargetClass(source, targetType);
    }
}
