package designpattern.builder;

/**
 * 食品包装盒
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}
