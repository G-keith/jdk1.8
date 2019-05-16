package designpattern.builder;

/**
 * 汉堡
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public abstract class Burger extends Item{
    @Override
    public Packing pack() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
