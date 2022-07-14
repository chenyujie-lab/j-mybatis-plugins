package jm.dict.plugin.annotation;


import jm.dict.plugin.selector.JDictSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Chen Yujie
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import(JDictSelector.class)
public @interface EnableDictMapping {
}
