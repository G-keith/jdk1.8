package interfaces;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-02
 */
public interface IUser {

    default  void defaultMethod(){
        System.out.println("我是接口的默认方法");
    }

    void normalMethod();

    static void staticMethod(){
        System.out.println("我是接口的静态方法");
    }
}
