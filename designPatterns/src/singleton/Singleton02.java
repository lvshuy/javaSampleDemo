package singleton;

/*
 * ����ʽ
 * 3������ʽ
�Ƿ� Lazy ��ʼ������

�Ƿ���̰߳�ȫ����

ʵ���Ѷȣ���

���������ַ�ʽ�Ƚϳ��ã������ײ�����������
�ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
������ classloader ���Ʊ����˶��̵߳�ͬ�����⣬������instance ����װ��ʱ��ʵ������
��Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ��� getInstance ������
����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ�� instance
��Ȼû�дﵽ lazy loading ��Ч����
 * */
public class Singleton02 {
    private Singleton02(){}
    private static Singleton02 instance = new Singleton02();
    public static Singleton02 getInstance(){
        return instance;
    }
}