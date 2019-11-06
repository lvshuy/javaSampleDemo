package chap01;
/*
* 简化格式：	数据类型 数组名称 = {值, 值,…}
* 完整格式： 数据类型 数组名称 = new 数据类型[] {值, 值,…}
* */
public class ArrayTest {
    public static void main(String args[]) {

        int data[] = new int[3]; /*开辟了一个长度为3的数组*/
        data[0] = 10; // 第一个元素
        data[1] = 20; // 第二个元素
        data[2] = 30; // 第三个元素
        for(int x = 0; x < data.length; x++) {
            System.out.println(data[x]); //通过循环控制索引
        }

        int temp[] = data;
        temp = data;  //int temp[] = data;
        temp[0] = 99;
        for(int i = 0; i < temp.length; i++) {
            System.out.println(data[i]);
        }

        // 二维数组
        int[][] data1 = new int[][]{{1, 2, 4},{545, 11},{32, 13131, 4444}};
        System.out.println(data1.length);
        System.out.println(data1[1].length);
    }
}
