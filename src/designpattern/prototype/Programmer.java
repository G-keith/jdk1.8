package designpattern.prototype;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-21
 */
public class Programmer implements Cloneable{

    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programmer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object= super.clone();
        //深度克隆
        Programmer programmer=(Programmer) object;
        programmer.address=(Address) this.address.clone();
        return object;
    }
}
