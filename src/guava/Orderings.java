package guava;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-11
 */
public class Orderings {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(15);
        numbers.add(51);
        numbers.add(53);
        numbers.add(35);
        numbers.add(45);
        numbers.add(32);
        numbers.add(43);
        numbers.add(16);
        Ordering ordering = Ordering.natural();
        System.out.println(ordering.isOrdered(numbers));
        Collections.sort(numbers);
        System.out.println(numbers);
        //是否排序成功(从小到大)
        boolean b=ordering.isOrdered(numbers);
        System.out.println(b);



    }
}
