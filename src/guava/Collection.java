package guava;

import com.google.common.collect.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-11
 */
public class Collection {

    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        Multimap<String,String> multimap = ArrayListMultimap.create();
        multimap.put("MAP","101");
        multimap.put("MAP","102");
        System.out.println(multimap);
        BiMap<Integer, String> empIDNameMap = HashBiMap.create();
        //行键/列键/值
        Table<String, String, String> employeeTable = HashBasedTable.create();
        employeeTable.put("IBM", "101","Mahesh");
        employeeTable.put("IBM", "102","Ramesh");
        employeeTable.put("IBM", "103","Suresh");

        employeeTable.put("Microsoft", "111","Sohan");
        employeeTable.put("Microsoft", "112","Mohan");
        employeeTable.put("Microsoft", "113","Rohan");

        employeeTable.put("TCS", "121","Ram");
        employeeTable.put("TCS", "122","Shyam");
        employeeTable.put("TCS", "123","Sunil");
        System.out.println(employeeTable);
    }
}
