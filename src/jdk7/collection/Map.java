package jdk7.collection;

import java.util.TreeMap;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-10
 */
public class Map {

    public static void main(String[] args) {
        //排序
        TreeMap map=new TreeMap();
        map.put("1",2);
        map.put("3",2);
        map.put("2",2);
        map.put("10",2);
        System.out.println(map);
    }
}
