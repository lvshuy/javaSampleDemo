package chap01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        NewsTitle car = new NewsTitle(1,"����","zhangsan");
        NewsTitle test = new NewsTitle(2, "����", "wangwu");
        List newsTitle = new ArrayList();
        newsTitle.add(car);
        newsTitle.add(test);
        System.out.println("���ű�����Ŀ��"+newsTitle.size());
        for (Object obj:newsTitle) {
            NewsTitle title = (NewsTitle)obj;
            System.out.println(title.getTitleName());
        }
    }
}
