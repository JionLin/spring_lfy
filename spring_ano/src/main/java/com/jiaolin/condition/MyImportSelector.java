package com.jiaolin.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author johnny
 * @Classname MyImportSelector
 * @Description
 * @Date 2022/5/9 09:41
 */
public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.jiaolin.bean.Yellow"};
    }
}
