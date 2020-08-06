package factory.method;

import com.sn.pattern.factory.method.factory.CatFactoryAble;
import com.sn.pattern.factory.method.factory.DogFactoryAble;
import com.sn.pattern.factory.simple.constant.AnimalEnum;
import com.sn.pattern.factory.simple.entity.AbstractAnimal;
import com.sn.pattern.factory.simple.factory.SimpleFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @description: 工厂模式测试类
 * @Description: SUCCESS
 * @author: Gardenia
 * @created: 2020/08/05 16:23:31
 * @Version: 1.0
 */
@Slf4j
public class FactoryTest {

    @Test
    public void testAnimal() {
        CatFactoryAble catFactoryAble = new CatFactoryAble();
        catFactoryAble.getAnimal().eat();

        DogFactoryAble dogFactoryAble = new DogFactoryAble();
        dogFactoryAble.getAnimal().eat();
    }
}