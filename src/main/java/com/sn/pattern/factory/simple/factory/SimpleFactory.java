package com.sn.pattern.factory.simple.factory;

import com.sn.pattern.factory.simple.constant.AnimalEnum;
import com.sn.pattern.factory.simple.entity.AbstractAnimal;
import com.sn.pattern.factory.simple.entity.Cat;
import com.sn.pattern.factory.simple.entity.Dog;

/**
 * @description: 动物类实现工厂
 * @Description: SUCCESS
 * @author: Gardenia
 * @created: 2020/08/05 16:12:08
 * @Version: 1.0
 */
public class SimpleFactory {

    public static AbstractAnimal getAnimal(AnimalEnum animalEnum) {
        switch (animalEnum) {
            case Cat:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                return null;
        }
    }
}