package stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author keith
 * @version 1.0
 * @date 2019-03-29
 */
public class Demo {

    public static void stream(){
        List<User> userList=new ArrayList<>();
        userList.add(new User("小红",20,"女"));
        userList.add(new User("小明",25,"男"));
        userList.add(new User("张三",50,"男"));
        userList.add(new User("张三",29,"男"));
//        userList.forEach(System.out::println);
//        //流的删选写法
        List<User> filterList=userList.stream().filter(user -> user.getAge()>20).collect(toList());
//        System.out.println("删选写法："+filterList);
//        //去重
//        //List<User> distinctList=userList.stream().distinct().collect(toList());
//        System.out.println("去重写法："+filterList);

//        //截取
//        List<User> limitList=userList.stream().limit(2).collect(toList());
//        System.out.println("截取写法："+limitList);
//        //跳过
//        List<User> skipList=userList.stream().skip(1).collect(toList());
//        System.out.println("跳过："+skipList);
//        //获取某一属性集合
        List<String> collection=userList.stream().map(User::getName).collect(toList());
//        System.out.println("获取某一属性集合："+collection);
        //分组写法
        Map<String,List<User>> listMap=userList.stream().collect(Collectors.groupingBy(User::getSex));
        System.out.println(listMap);
        //分组计数
        Map<String,Long> collect=userList.stream().collect(Collectors.groupingBy(User::getSex,Collectors.counting()));
        System.out.println("分组计数："+collect);
        //"分组求和"
        Map<String,Long> collect2=userList.stream().collect(Collectors.groupingBy(User::getSex,Collectors.summingLong(User::getAge)));
        System.out.println("分组求和："+collect2);
        Map<String,Long> collect3=userList.stream().collect(Collectors.groupingBy((e-> e.getSex()+"_"+e.getName()),Collectors.summingLong(User::getAge)));
        System.out.println("多字段分组求和："+collect3);
        TreeMap<String,Long> collect4=userList.stream().collect(Collectors.groupingBy(User::getSex, TreeMap::new,Collectors.summingLong(User::getAge)));
        System.out.println("分组升序排序："+collect4);
        NavigableMap<String,Long> collect5=userList.stream().collect(Collectors.groupingBy(User::getSex, TreeMap::new ,Collectors.summingLong(User::getAge))).descendingMap();
        System.out.println("分组降序排序："+collect5);
        //设置值
//        userList.forEach(item->{
//            item.getName();
//            item.setName(item.getName()+"测试");
//        });
//        System.out.println(userList);
    }


    public static void main(String[] args) {
        stream();
    }
}
