package chap01;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        NewsTitle car = new NewsTitle(1,"汽车","zhangsan");
        NewsTitle test = new NewsTitle(2, "考试", "wangwu");
        NewsTitle fun = new NewsTitle(1,"娱乐","zhangsan");
        NewsTitle gym = new NewsTitle(2, "体育", "wangwu");

        LinkedList list = new LinkedList();
        list.add(car);
        list.add(test);
        list.add(fun);

        System.out.println(((NewsTitle)(list.getFirst())).getTitleName());
//       在集合首部插入元素
        list.addFirst(gym);
        System.out.println(((NewsTitle)(list.getFirst())).getTitleName());
    }
}
