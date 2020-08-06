package com.sn.pattern.factory.method.factory;

import com.sn.pattern.factory.method.entity.AbstractAnimal;

/**
 * @description: 工厂接口
 * @Description: SUCCESS
 * @author: Gardenia
 * @created: 2020/08/05 16:12:08
 * @Version: 1.0
 */
public interface AnimalFactory {

    /**
     * 获取动物
     *
     * @return AbstractAnimal
     */
    AbstractAnimal getAnimal();
}