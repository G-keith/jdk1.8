package designpattern.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(FactoryEnum.ShapeEnum shape);
    public abstract Colour getColour(FactoryEnum.colourEnum colour);
}
