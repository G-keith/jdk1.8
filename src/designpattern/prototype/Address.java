package designpattern.prototype;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-21
 */
public class Address implements Cloneable{

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("city='").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     *  深度克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
