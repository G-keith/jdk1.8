package designpattern.factory;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class TestFactory {

    public static void main(String[] args) {
        People man=PeopleFactory.getPeople("man","男人","男",25);
        System.out.println(man);
    }
}
