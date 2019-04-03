package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author keith
 * @version 1.0
 * @date 2019-03-29
 */
public class demo {

    public static void stream(){
        List<User> userList=new ArrayList<>();
        userList.add(new User("小红",20,"女"));
        userList.add(new User("小明",25,"男"));
        userList.add(new User("张三",50,"男"));
//        //流的删选写法
        List<User> filterList=userList.stream().filter(user -> user.getAge()>20).collect(toList());
        System.out.println("删选写法："+filterList);
//        //去重
//        //List<User> distinctList=userList.stream().distinct().collect(toList());
//        //截取
//        List<User> limitList=userList.stream().limit(2).collect(toList());
//        System.out.println("截取写法："+limitList);
//        //跳过
//        List<User> skipList=userList.stream().skip(1).collect(toList());
//        System.out.println("跳过："+skipList);
//        //获取某一属性集合
//        List<String> collection=userList.stream().map(User::getName).collect(toList());
//        System.out.println("获取某一属性集合："+collection);
        //设置值
        userList.forEach(item->{
            item.setName(item.getName()+"测试");
        });
        System.out.println(userList);
    }


    public static void main(String[] args) {
        stream();
    }
}
