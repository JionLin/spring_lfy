package com.jiaolin.condition;

import com.jiaolin.bean.Blue;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author johnny
 * @Classname MyImportBeanDefinitionRegistrar
 * @Description
 * @Date 2022/5/9 12:30
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @return void
     * @Author johnny
     * @Description importingClassMetadata 当前类的注解信息
     * registry  需要注册进来的哪些bean
     * @Date 12:36 2022/5/9
     * @Param [importingClassMetadata, registry]
     **/
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean value = registry.containsBeanDefinition("com.jiaolin.bean.Yellow");
        if (value) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Blue.class);
            registry.registerBeanDefinition("com.jiaolin.bean.Blue", beanDefinition);
        }

    }
}
