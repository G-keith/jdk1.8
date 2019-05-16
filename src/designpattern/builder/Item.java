package designpattern.builder;

/**
 * 食品套餐抽象类型
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public abstract class Item {
    public abstract String name();
    public abstract Packing pack();
    public abstract float price();
}
