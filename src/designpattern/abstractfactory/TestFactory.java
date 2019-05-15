package designpattern.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class TestFactory {

    public static void main(String[] args) {
        //工厂选择器选择加载哪个工厂
        AbstractFactory shapeFactory=FactoryProducer.getFactory(FactoryEnum.factoryEnum.SHAPE);
        assert shapeFactory != null;
        //根据工厂调用对于工厂里面的方法
        Shape square=shapeFactory.getShape(FactoryEnum.ShapeEnum.SQUARE);
        square.area();
        Shape rectangle=shapeFactory.getShape(FactoryEnum.ShapeEnum.RECTANGLE);
        rectangle.area();

        AbstractFactory colourFactory=FactoryProducer.getFactory(FactoryEnum.factoryEnum.COLOUR);
        assert colourFactory != null;
        Colour red=colourFactory.getColour(FactoryEnum.colourEnum.RED);
        red.colour();
        Colour blue=colourFactory.getColour(FactoryEnum.colourEnum.BLUE);
        blue.colour();

        AbstractFactory qqq=FactoryProducer.getFactory(FactoryEnum.factoryEnum.SHAPE);
    }


}
