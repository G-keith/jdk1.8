package jdk7.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author keith
 * @version 1.0
 * @date 2019/10/15
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        Set<String> set = new HashSet<>(list);
        System.out.println("没有去重前的数据为>>>" + list.toString());
        System.out.println("去重后的数据为>>>" + set.toString());
    }
}
