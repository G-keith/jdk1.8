package clone;

/**
 * @author keith
 * @version 1.0
 * @date 2019/10/9
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝
        A a=new A(25,"测试","男");
        C c=new C(25,"测试","男");

        A a1= (A) a.clone();
        System.out.println(a);
        System.out.println(a1);

        //B不实现Cloneabled的情况 改变B，A对应的值也被改变了
        B b=new B("篮球");
        a.setB(b);
        a1=(A)a.clone();
        a1.getB().setHappy("足球");
        System.out.println(a);
        System.out.println(a1);

        //深克隆，改变B，A对应的值不变
        B b2=new B("篮球");
        c.setB(b2);
        C c1=(C)c.clone();
        c1.getB().setHappy("足球");
        System.out.println(c);
        System.out.println(c1);
    }
}
