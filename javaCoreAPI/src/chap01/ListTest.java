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

        int data[] = new int[3]; /*开辟了一个长度为3的数组*/
        data[0] = 10; // 第一个元素
        data[1] = 20; // 第二个元素
        data[2] = 30; // 第三个元素
        for(int x = 0; x < data.length; x++) {
            System.out.println(data[x]); //通过循环控制索引
        }
    }
}
