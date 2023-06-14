package com.ntdq.hnscreen.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AttributeInfo {


    int startIndex() default 0;


    int endIndex() default 0;


    int funcType() default 0;
}
