package singleton;

/*
* ˫����/˫��У������DCL��
* 4��˫����/˫��У������DCL���� double-checked locking��
JDK �汾��JDK1.5 ��

�Ƿ� Lazy ��ʼ������

�Ƿ���̰߳�ȫ����

ʵ���Ѷȣ��ϸ���

���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
getInstance() �����ܶ�Ӧ�ó���ܹؼ���
* */
public class Singleton04 {
    private Singleton04(){}
    private volatile static Singleton04 instance;
    public static Singleton04 getInstance(){
        if (instance==null){
            synchronized (Singleton04.class){
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
