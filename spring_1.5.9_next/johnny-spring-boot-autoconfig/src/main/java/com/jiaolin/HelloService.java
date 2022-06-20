package com.jiaolin;

/**
 * @author johnny
 * @Classname HelloService
 * @Description
 * @Date 2022/5/19 11:09
 */
public class HelloService {

    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String SayHello(String name) {
        return helloProperties.getPrefix() +":"+ name +":"+ helloProperties.getSuffix();
    }
}
