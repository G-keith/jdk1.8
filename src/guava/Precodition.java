package guava;

import com.google.common.base.Preconditions;

/**
 * https://www.yiibai.com/guava
 * @author keith
 * @version 1.0
 * @date 2019-04-11
 */
public class Precodition {

    public static void main(String[] args) {
        Precodition precodition = new Precodition();
        System.out.println(precodition.getValue());
    }
    private int getValue() {
        int[] data = {1, 2, 3, 4, 5};
        Preconditions.checkElementIndex(4, data.length,
                "Illegal Argument passed: Invalid index.");
        return data[4];
    }


}
