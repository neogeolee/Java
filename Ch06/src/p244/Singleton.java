package p244;

public class Singleton {
	
	//�����ʵ�
	private static Singleton singleton = new Singleton();
	
	//������
	private Singleton() {}
	
	//�����޼ҵ�
	public static Singleton getInstance() {
		return singleton;
	}
		
	

}
