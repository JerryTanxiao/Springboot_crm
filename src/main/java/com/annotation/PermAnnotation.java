package com.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PermAnnotation {
    /**
     * 权限名
     * @return
     */
    String pname() default "";

    /**
     * 权限值
     * @return
     */
    String pval() default "";
}
