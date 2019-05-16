package designpattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class AppleDrink extends Drink{

    private int num;

    public AppleDrink(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "appleDrink";
    }

    @Override
    public float price() {
        return this.num*10.0f;
    }
}
