package com.sn.pattern.factory.method.entity;


import lombok.extern.slf4j.Slf4j;

/**
 * @description: 动物类子类-猫类
 * @Description: SUCCESS
 * @author: Gardenia
 * @created: 2020/08/05 16:11:06
 * @Version: 1.0
 */
@Slf4j
public class Cat extends AbstractAnimal {

    @Override
    public void eat() {
        log.info("猫要吃猫粮");
    }
}