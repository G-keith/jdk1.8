package designpattern.builder;

/**
 * 饮料包装盒
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "bottle";
    }
}
