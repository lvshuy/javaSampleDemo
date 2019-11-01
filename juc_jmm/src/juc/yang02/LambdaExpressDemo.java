package juc.yang02;

@FunctionalInterface
interface Foo {

//    public void sayHello();
    public int add(int x, int y);

    //�ɶ�����
    public default int mul(int x, int y){
        return x*y;
    }

    //���Զ�����
    public static int div(int x, int y){
        return x/y;
    }
}

public class LambdaExpressDemo {

    public static void main(String[] args) {
        /*Foo foo = new Foo() {
            @Override
            public void sayHello() {
                System.out.println("****hello�������ڲ���");
            }

            @Override
            public int add(int x, int y) {
                return (x+y);
            }
        };
        foo.sayHello();
        System.out.println(foo.add(2,3));*/

        // lambda�ھ�������С���ţ�д���Ҽ�ͷ����ش����š�
//        Foo foo = () -> {System.out.println("****hello��lambda���ʽ");};
        Foo foo = (int x, int y) -> {
            System.out.println("****hello���������");
            return (x+y);
        };
        System.out.println(foo.add(2,3));
        System.out.println(foo.mul(2,4));
        System.out.println(Foo.div(8,4));
    }
}
