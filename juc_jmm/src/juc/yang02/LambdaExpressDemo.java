package juc.yang02;

@FunctionalInterface
interface Foo {

//    public void sayHello();
    int add(int x, int y);

    //可定义多个
    default int mul(int x, int y){
        return x*y;
    }

    //可以定义多个
    static int div(int x, int y){
        return x/y;
    }
}

public class LambdaExpressDemo {

    public static void main(String[] args) {
        /*Foo foo = new Foo() {
            @Override
            public void sayHello() {
                System.out.println("****hello，匿名内部类");
            }

            @Override
            public int add(int x, int y) {
                return (x+y);
            }
        };
        foo.sayHello();
        System.out.println(foo.add(2,3));*/

        // lambda口诀：拷贝小括号，写死右箭头，落地大括号。
//        Foo foo = () -> {System.out.println("****hello，lambda表达式");};
        Foo foo = (int x, int y) -> {
            System.out.println("****hello，相加运算");
            return (x+y);
        };
        System.out.println(foo.add(2,3));
        System.out.println(foo.mul(2,4));
        System.out.println(Foo.div(8,4));
    }
}
