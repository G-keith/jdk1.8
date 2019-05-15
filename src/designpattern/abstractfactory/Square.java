package designpattern.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class Square implements Shape{
    @Override
    public void area() {
        System.out.println("正方形面积");
    }
}
