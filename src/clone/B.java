package clone;

import java.util.StringJoiner;

/**
 * @author keith
 * @version 1.0
 * @date 2019/10/9
 */
public class B  implements Cloneable{

    private String happy;

    public B(String happy) {
        this.happy = happy;
    }

    public String getHappy() {
        return happy;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", B.class.getSimpleName() + "[", "]")
                .add("happy='" + happy + "'")
                .toString();
    }
}
