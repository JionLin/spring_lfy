package com.jiaolin.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author johnny
 * @Classname ColorFactoryBean
 * @Description
 * @Date 2022/5/12 14:05
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    // 返回一个color对象,这个对象会添加到容器中
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...getObject...");
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }


    /**
     * @Author johnny
     * @Description  是否是单实例 true 是
     * @Date 14:08 2022/5/12
     * @Param []
     * @return boolean
     **/
    public boolean isSingleton() {
        return true;
    }
}
