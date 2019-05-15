package designpattern.factory;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class TestFactory {

    public static void main(String[] args) {
        People man=PeopleFactory.getPeople(PeopleEnum.MAN,"男人","男",25);
        People woman=PeopleFactory.getPeople(PeopleEnum.WOMAN,"女人","女",30);
        System.out.println(man);
        System.out.println(woman);
    }
}
