package designpattern.prototype;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-21
 */
public class ProgrammerTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Programmer programmer=new Programmer();
        Address address=new Address();
        address.setCity("无锡");
        programmer.setName("小明");
        programmer.setAddress(address);
        System.out.println(programmer);
        Programmer programmer1= (Programmer) programmer.clone();
        programmer1.setName("小红");
        programmer1.getAddress().setCity("淮安");
        System.out.println(programmer1);
        System.out.println(programmer);
    }
}
