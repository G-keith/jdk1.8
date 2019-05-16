package designpattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class BeefBurger extends Burger{

    private int num;

    public BeefBurger(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "beefBurger";
    }

    @Override
    public float price() {
        return this.num*30.0f;
    }
}
