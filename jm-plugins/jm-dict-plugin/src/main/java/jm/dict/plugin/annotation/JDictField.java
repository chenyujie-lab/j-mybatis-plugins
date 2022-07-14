package jm.dict.plugin.annotation;

import java.lang.annotation.*;

/**
 * @author Chen Yujie
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface JDictField {
    /**
     * 字典类型
     */
    String type() default "";

    /**
     * 字典备注
     */
    String remark() default "";
}
