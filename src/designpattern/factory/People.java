package designpattern.factory;

/**
 * 这是一个关于人的抽象类
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public abstract class People {

    public abstract String getName();
    public abstract String getSex();
    public abstract Integer getAge();

    @Override
    public String toString(){
        return "Name= "+this.getName()+", Sex="+this.getSex()+", Age="+this.getAge();
    }
}
