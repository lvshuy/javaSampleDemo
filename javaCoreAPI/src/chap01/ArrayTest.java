package chap01;
/*
* �򻯸�ʽ��	�������� �������� = {ֵ, ֵ,��}
* ������ʽ�� �������� �������� = new ��������[] {ֵ, ֵ,��}
* */
public class ArrayTest {
    public static void main(String args[]) {

        int data[] = new int[3]; /*������һ������Ϊ3������*/
        data[0] = 10; // ��һ��Ԫ��
        data[1] = 20; // �ڶ���Ԫ��
        data[2] = 30; // ������Ԫ��
        for(int x = 0; x < data.length; x++) {
            System.out.println(data[x]); //ͨ��ѭ����������
        }

        int temp[] = data;
        temp = data;  //int temp[] = data;
        temp[0] = 99;
        for(int i = 0; i < temp.length; i++) {
            System.out.println(data[i]);
        }

        // ��ά����
        int[][] data1 = new int[][]{{1, 2, 4},{545, 11},{32, 13131, 4444}};
        System.out.println(data1.length);
        System.out.println(data1[1].length);
    }
}
