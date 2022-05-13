package com.jiaolin.bean.autowired;

import org.springframework.stereotype.Component;

/**
 * @author johnny
 * @Classname Boss
 * @Description
 * @Date 2022/5/13 13:05
 */
@Component
public class Boss {

    private Fruit fruit;


    public Boss(Fruit fruit) {
        this.fruit = fruit;
    }


    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "fruit=" + fruit +
                '}';
    }
}
