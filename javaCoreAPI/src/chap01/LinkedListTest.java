package chap01;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        NewsTitle car = new NewsTitle(1,"����","zhangsan");
        NewsTitle test = new NewsTitle(2, "����", "wangwu");
        NewsTitle fun = new NewsTitle(1,"����","zhangsan");
        NewsTitle gym = new NewsTitle(2, "����", "wangwu");

        LinkedList list = new LinkedList();
        list.add(car);
        list.add(test);
        list.add(fun);

        System.out.println(((NewsTitle)(list.getFirst())).getTitleName());
//       �ڼ����ײ�����Ԫ��
        list.addFirst(gym);
        System.out.println(((NewsTitle)(list.getFirst())).getTitleName());
    }
}
