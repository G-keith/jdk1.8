package designpattern.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class ColourFactory extends AbstractFactory{
    @Override
    public Shape getShape(FactoryEnum.ShapeEnum shape) {
        return null;
    }

    @Override
    public Colour getColour(FactoryEnum.colourEnum colour) {
        if(FactoryEnum.colourEnum.RED.equals(colour)){
            return new Red();
        }else if(FactoryEnum.colourEnum.BLUE.equals(colour)){
            return new Blue();
        }
        return null;
    }
}
