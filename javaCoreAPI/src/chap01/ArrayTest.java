package chap01;
/*
* 简化格式：	数据类型 数组名称 = {值, 值,…}
* 完整格式： 数据类型 数组名称 = new 数据类型[] {值, 值,…}
* */
public class ArrayTest {
    public static void main(String args[]) {

        int[] data = new int[3]; //开辟一个长度为3的数组
        int temp[] = null; //声明对象
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        temp = data;  //int temp[] = data;
        temp[0] = 99;
        for(int i = 0; i < temp.length; i++) {
            System.out.println(data[i]);
        }

        //        二维数组
        int[][] data1 = new int[][]{{1, 2, 4},{545, 11},{32, 13131, 4444}};
        System.out.println(data1.length);
        System.out.println(data1[1].length);
    }
}
