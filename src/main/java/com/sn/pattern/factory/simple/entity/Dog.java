package com.sn.pattern.factory.simple.entity;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 动物类子类-狗类
 * @Description: SUCCESS
 * @author: Gardenia
 * @created: 2020/08/05 16:10:07
 * @Version: 1.0
 */
@Slf4j
public class Dog extends AbstractAnimal {

    @Override
    public void eat() {
        log.info("狗要吃狗粮");
    }
}