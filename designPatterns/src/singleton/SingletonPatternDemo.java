package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 Singleton01() 是不可见的
        //Singleton01 object = new Singleton01();

        //获取唯一可用的对象
        Singleton01 obj = Singleton01.getInstance();

    }
}
