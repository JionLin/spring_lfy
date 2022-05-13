package com.jiaolin.bean.autowired;

/**
 * @author johnny
 * @Classname Wifi
 * @Description
 * @Date 2022/5/13 13:26
 */
public class Wifi {
    private Fruit fruit;

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Wifi{" +
                "fruit=" + fruit +
                '}';
    }
}
