package interfaces;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-02
 */
public class UserImpl implements IUser{
    @Override
    public void normalMethod() {
        System.out.println("重写接口普通方法");
    }

    @Override
    public void defaultMethod() {
        System.out.println("重写接口默认方法");
    }

    public static void staticMethod() {
        System.out.println("实现类口静态方法");
    }

    public static void main(String[] args) {
        IUser iUser=new UserImpl();
        iUser.normalMethod();
        iUser.defaultMethod();
        UserImpl.staticMethod();
        IUser.staticMethod();
    }
}
