package com.jiaolin.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author johnny
 * @Classname LinuxCondition 按需加载
 * @Description
 * @Date 2022/5/6 16:19
 */
public class LinuxCondition implements Condition {


    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if (!property.contains("Windows")) {
            return true;
        }
        return false;
    }
}
