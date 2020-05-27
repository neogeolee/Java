package sub1;
/*
 * ��¥ : 2020/05/18
 * �̸� : ������
 * ���� : Object Ŭ���� �ǽ��ϱ� ���� p457
 * 
 * Object Ŭ����
 *  - �ڹ��� �ֻ��� Ŭ����
 *  - ��� Ŭ������ �θ�Ŭ������ ������ ���뿡 Ȱ��ȴ�.
 *   
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		// �������� Ȱ��Ǵ� Object Ŭ����
		Object obj1 = new Apple("�ѱ�", 3000);
		Object obj2 = new Apple("�Ϻ�", 2000);
		Object obj3 = new Banana("�븸", 2500);
		Object obj4 = new Banana("�߱�", 1500);
		
		//a1.info();
		//b1.info();
		  //object Ŭ�������� info �޼��尡 ����. ����Ŭ�����̱� ������ �츮�� �޼��带 ������ ������ �׷��� ĳ���ù����� ����ؾ���
		
		//�ٿ�ĳ����
		Apple a1 = (Apple)obj1;
		Banana b3 = (Banana)obj3;
		
		a1.info();
		b3.info();
		
		Object fruit[] = {obj1,obj2,obj3,obj4}; 
		
		Apple a2 = (Apple)fruit[1];
		a2.info();
		
		Banana b4 = (Banana)fruit[3];
		b4.info();
		
		//to String�� ���� �ٿ�ĳ���� �ʿ����(object�� �ִ°� �������̵� �Ѱ��� )
		obj1.toString();
		obj2.toString();
				
	}//main end

}
