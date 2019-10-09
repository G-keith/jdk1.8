package clone;

import java.util.StringJoiner;

/**
 * @author keith
 * @version 1.0
 * @date 2019/10/9
 */
public class A implements Cloneable {

    private Integer age;

    private String name;

    private String sex;

    private B b;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    A(Integer age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", A.class.getSimpleName() + "[", "]")
                .add("age=" + age)
                .add("name='" + name + "'")
                .add("sex='" + sex + "'")
                .add("b=" + b)
                .toString();
    }
}
