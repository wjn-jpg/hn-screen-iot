package com.ntdq.hnscreen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ModelArguments {

    /**
     * 编码
     *
     * @return
     */
    String code() default "";

    /**
     * 描述
     *
     * @return
     */
    String mean() default "";

    /**
     * 地址信息
     *
     * @return
     */
    int number() default 0;

    /**
     * 点表类型
     *
     * @return
     */
    int type() default 0;

    /**
     * 字节长度
     *
     * @return
     */
    int length() default 2;

    float coefficient() default 1.0f;

}
