package factory.simple;

import com.sn.pattern.factory.simple.constant.AnimalEnum;
import com.sn.pattern.factory.simple.entity.AbstractAnimal;
import com.sn.pattern.factory.simple.factory.AnimalSimpleFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @description: 简单工厂模式测试类
 * @Description: SUCCESS
 * @author: Gardenia
 * @created: 2020/08/05 16:23:31
 * @Version: 1.0
 */
@Slf4j
public class AbstractAnimalTest {

    @Test
    public void testAnimal() {
        AbstractAnimal cat = AnimalSimpleFactory.getAnimal(AnimalEnum.Cat);
        if(cat != null) {
            cat.eat();
        }

        AbstractAnimal dog = AnimalSimpleFactory.getAnimal(AnimalEnum.DOG);
        if(dog != null) {
            dog.eat();
        }
    }
}