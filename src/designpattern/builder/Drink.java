package designpattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public abstract class Drink extends Item{
    @Override
    public Packing pack() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
