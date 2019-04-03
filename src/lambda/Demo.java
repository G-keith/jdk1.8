package lambda;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-03
 */

/**
 * //左边代表函数，右边代表函数主体
 * 能够接收Lambda表达式的参数类型，是一个只包含一个方法的接口。只包含一个方法的接口称之为“函数接口”。
 */
public class Demo {
    private void testLambda() {
//        func(new FunctionInterface() {
//            @Override
//            public void test() {
//                System.out.println("Hello World!");
//            }
//        });
        //使用Lambda表达式代替上面的匿名内部类
        func(() -> System.out.println("Hello World"));
    }

    private void func(FunctionInterface functionInterface) {
        functionInterface.test();
    }

    private void testLambda2() {
        func2(x -> System.out.println("Hello World2"));
    }

    private void func2(FunctionInterface2 functionInterface2) {
        //指明入参类型，虽然大部分情况可以自动推断出，函数接口是一个泛型的时候不能推断出
        int x=2;
        functionInterface2.test(x);
    }

    private void testLambda3() {
        func3((Integer x)->{
            System.out.println("Hello World3");
            if(x>2){
                return true;
            }else{
                return false;
            }
            });
    }

    private void func3(FunctionInterface3<Integer> functionInterface3) {
        //指明入参类型，虽然大部分情况可以自动推断出，函数接口是一个泛型的时候不能推断出
        int x=3;
        boolean b=functionInterface3.test(x);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.testLambda();
        demo.testLambda2();
        demo.testLambda3();
    }
}
