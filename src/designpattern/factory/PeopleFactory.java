package designpattern.factory;

/**
 * 人的类型工厂
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class PeopleFactory {

    public static People getPeople(PeopleEnum type, String name, String sex, Integer age){
        if(PeopleEnum.MAN.equals(type)){
            return new ManPeople(name,sex,age);
        }else if(PeopleEnum.WOMAN.equals(type)){
            return new WomanPeople(name,sex,age);
        }else{
            return null;
        }
    }
}
