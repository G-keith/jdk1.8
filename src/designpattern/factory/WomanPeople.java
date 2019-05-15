package designpattern.factory;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class WomanPeople extends People{

    private String name;
    private String sex;
    private Integer age;

    public WomanPeople(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}
