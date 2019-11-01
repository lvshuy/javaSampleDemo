package singleton;
/*
* ��������ʽ
* 2������ʽ���̰߳�ȫ
�Ƿ� Lazy ��ʼ������

�Ƿ���̰߳�ȫ����

ʵ���Ѷȣ���

���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
�ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
* */
public class Singleton03 {
    private Singleton03(){}
    private static Singleton03 instance;
    public static synchronized Singleton03 getInstance(){
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
