package com.market.types.annotations;


import java.lang.annotation.*;

/**
 * @author: car
 * @create: 2026/11/16 23:45
 * @description: 注解，动态配置中心标记
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface DCCValue {
    String value() default "";

}
