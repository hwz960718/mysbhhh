package com.hwz.mysbhhh.design.factory;

/**
 * @author hwz
 * @date 2020/6/16
 */
public class FruitFactory {
    public Fruit produce(String type){
        if ("apple".equals(type)){
            return new Apple();
        }else if ("orange".equals(type)){
            return new Orange();
        }else {
            throw new RuntimeException();
        }
    }
}
