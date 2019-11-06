package test;

public class Main {
    public static void main(String[] args) {
        int index = 1;
        int[] foo = new int[3];
        int bar = foo[index];
        int baz = bar+index;
        System.out.println(foo[0]);
        System.out.println(foo[1]);
        System.out.println(foo[2]);
        System.out.println(bar+"===="+baz);
    }
}
