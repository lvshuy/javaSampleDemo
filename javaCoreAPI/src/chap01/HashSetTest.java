package chap01;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(null);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(null));
        System.out.println(set.remove(null));
        System.out.println(set.size());
    }
}
