package designpattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class PearDrink extends Drink{
    private int num;

    public PearDrink(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "pearDrink";
    }

    @Override
    public float price() {
        return this.num*8.0f;
    }
}
