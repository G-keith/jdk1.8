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
        numbers.add(new Integer(5));
        numbers.add(new Integer(2));
        numbers.add(new Integer(15));
        numbers.add(new Integer(51));
        numbers.add(new Integer(53));
        numbers.add(new Integer(35));
        numbers.add(new Integer(45));
        numbers.add(new Integer(32));
        numbers.add(new Integer(43));
        numbers.add(new Integer(16));
        Ordering ordering = Ordering.natural();
        Collections.sort(numbers);
        System.out.println(numbers);
        //是否排序成功(从小到大)
        boolean b=ordering.isOrdered(numbers);



    }
}
