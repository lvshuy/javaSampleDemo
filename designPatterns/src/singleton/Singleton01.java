package singleton;
/*
* ����ʽ
* 1������ʽ���̲߳���ȫ
�Ƿ� Lazy ��ʼ������

�Ƿ���̰߳�ȫ����

ʵ���Ѷȣ���

���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
* */
public class Singleton01 {
    private Singleton01(){}
    private static Singleton01 instance;
    public static Singleton01 getInstance(){
        if (instance==null){
            instance = new Singleton01();
        }
        return instance;
    }
}
