package sub2;
/*
 * ��¥ : 2020/05/07
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//�������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-12-1234", "������", 10000);//private �������� ĸ��ȭ �߱� ������ ������ ��Ŀ� ���缭 ��ü���� �� �ʱ�ȭ����
		
		//�Ա�, ���, ��ȸ
		kb.deposit(10000);
		kb.withdraw(5000);
		kb.info();
		
		//�������� ��ü���� �� �ʱ�ȭ
		Account sh = new Account("��������", "121-11-1234", "������", 30000);
		
		//�Ա�, ���, ��ȸ�ϱ�
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
			
		
	}//main end

}
