package com.sn.pattern.factory.method.factory;

import com.sn.pattern.factory.method.entity.AbstractAnimal;
import com.sn.pattern.factory.method.entity.Dog;

/**
 * @description: 狗类制造工厂
 * @Description: SUCCESS
 * @author: Gardenia
 * @created: 2020/08/05 16:12:08
 * @Version: 1.0
 */
public class DogFactoryAble implements AnimalFactory {

    public AbstractAnimal getAnimal() {
        return new Dog();
    }
}