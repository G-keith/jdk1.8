package designpattern.factory;

/**
 * 人的类型工厂
 * @author keith
 * @version 1.0
 * @date 2019-05-15
 */
public class PeopleFactory {

    public static People getPeople(String type,String name,String sex,Integer age){
        if("man".equals(type)){
            return new ManPeople(name,sex,age);
        }else if("woman".equals(type)){
            return new WomanPeople(name,sex,age);
        }else{
            return null;
        }
    }
}
