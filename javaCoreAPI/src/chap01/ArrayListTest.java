package chap01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        NewsTitle car = new NewsTitle(1,"小汽车","zhangsan");
        NewsTitle test = new NewsTitle(2, "考试", "wangwu");
        List newsTitle = new ArrayList();
        newsTitle.add(car);
        newsTitle.add(test);
        System.out.println("List集合中的元素为"+newsTitle.size());
        for (Object obj:newsTitle) {
            NewsTitle title = (NewsTitle)obj;
            System.out.println(title.getTitleName());
        }
    }
}
