package designpattern.abstractfactory;

/**
 * 工厂选择器(实例化选择哪个工厂)
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryEnum.factoryEnum choice){
        if(FactoryEnum.factoryEnum.SHAPE.equals(choice)){
            return new ShapeFactory();
        }else if(FactoryEnum.factoryEnum.COLOUR.equals(choice)){
            return new ColourFactory();
        }
        return null;
    }
}
