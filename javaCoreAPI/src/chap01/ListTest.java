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

        int data[] = new int[3]; /*������һ������Ϊ3������*/
        data[0] = 10; // ��һ��Ԫ��
        data[1] = 20; // �ڶ���Ԫ��
        data[2] = 30; // ������Ԫ��
        for(int x = 0; x < data.length; x++) {
            System.out.println(data[x]); //ͨ��ѭ����������
        }
    }
}
