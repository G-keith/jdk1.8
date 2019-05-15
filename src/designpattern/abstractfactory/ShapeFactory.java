package designpattern.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(FactoryEnum.ShapeEnum shape) {
        if(FactoryEnum.ShapeEnum.SQUARE.equals(shape)){
            return new Square();
        }else if(FactoryEnum.ShapeEnum.RECTANGLE.equals(shape)){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Colour getColour(FactoryEnum.colourEnum colour) {
        return null;
    }
}
