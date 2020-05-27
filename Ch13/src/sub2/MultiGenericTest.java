package sub2;
/*
 * ��¥ : 2020/05/20
 * �̸� : ������
 * ���� : ���׸� Ŭ���� �ǽ��ϱ� ���� p654
 */
public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 100); //���׸��� ��ü�� ���, �׷��� int�� wrapper ���� Integer ����
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy 20");
		
		p1.show();
		p2.show();
		
	}//main end

}
