package designpattern.single;

/**
 * 饿汉式创建单例模式
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class SingletonOne {
    /**
     * 自己实例化自己
     */
    private static SingletonOne instance = new SingletonOne();

    /**
     * 私有化构造函数，不会被外界所实例化
     */
    private SingletonOne() {
    }

    /**
     * 提供对外访问的实例
     * @return
     */
    public static SingletonOne getInstance(){
        return instance;
    }
}
