package p407;

public class AnnoymousExample {
	public static void main(String[] args) {
		
		Annoymous annoy = new Annoymous();
		//�͸�ü �ʵ� ���
		annoy.field.wake();
		//�͸�ü ���ú������
		annoy.method1();
		//�͸� ��ü �Ű��� ���
		annoy.method2(
				new Person() {
				public void study() {
					System.out.println("�����մϴ�.");
				}
				@Override
				public void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
					}
				}
				);
		
	}//main end

}
