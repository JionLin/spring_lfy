package com.jiaolin;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author johnny
 * @Classname HelloProperties
 * @Description
 * @Date 2022/5/19 11:10
 */
@ConfigurationProperties(prefix = "jiaolin")
public class HelloProperties {
    private String prefix;

    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
