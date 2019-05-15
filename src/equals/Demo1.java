package equals;

import java.util.StringJoiner;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-25
 */
public class Demo1 {

    public static void main(String[] args) {
        //equals比较的是自己重写的方法，不重写默认和==一个效果
        Student student1=new Student("小明",1);
        Student student2=new Student("小明",1);
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));

        StringJoiner sj = new StringJoiner("Hollis");

        sj.add("hollischuang");
        sj.add("Java干货");
        System.out.println(sj.toString());

        StringJoiner sj1 = new StringJoiner(":","[","]");

        sj1.add("Hollis").add("hollischuang").add("Java干货");
        System.out.println(sj1.toString());
    }
}
