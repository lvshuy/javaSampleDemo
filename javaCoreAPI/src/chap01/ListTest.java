package chap01;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("zhangsan");
        list1.add("lisi");
        System.out.println(list1.size());
        for (Object i:list1) {
            System.out.println(i);
        }
        list1.remove(1);
        for (Object i:list1) {
            System.out.println(i);
        }
    }
}
