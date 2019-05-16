package designpattern.builder;

/**
 * 具体汉堡实现类
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class ChickenBurger extends Burger{

    private int num;

    public ChickenBurger(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "chickenBurger";
    }

    @Override
    public float price() {
        return this.num*25.0f;
    }
}
