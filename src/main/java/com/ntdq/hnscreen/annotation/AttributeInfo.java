package com.ntdq.hnscreen.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AttributeInfo {


    int startIndex() default 0;


    int endIndex() default 0;

    /**
     * yc or yx
     * 0  or  1
     * @return
     */
    int type() default 0;

}
