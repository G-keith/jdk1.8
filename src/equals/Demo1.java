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

        //如果整型字面量的值在-128 到 127 之间，那么不会 new 新的 Integer 对象，
        // 而是直接引用常量池中的Integer对象，
        // 所以上面的面试题中f1==f2的结果是 true，而f3==f4 的结果是false。
        Integer f1 = 100;
        Integer f2 = 100;
        Integer f3 = 150;
        Integer f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }
}
