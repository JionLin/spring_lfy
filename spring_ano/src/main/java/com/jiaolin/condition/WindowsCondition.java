package com.jiaolin.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author johnny
 * @Classname WindowsCondition
 * @Description
 * @Date 2022/5/6 16:22
 */
public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = context.getEnvironment().getProperty("os.name");
        if (property.contains("Windows")) {
            return true;
        }
        return false;
    }
}
