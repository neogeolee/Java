package sub1;
/*
 * ��¥ : 2020/05/14
 * �̸� : ������
 * ���� : ����ó�� �ǽ��ϱ� ���� p422
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		int num1=1;
		int num2=0;
		// try�ȿ��� �����ϸ� ������ try������ ���������� �ۿ��� ����,�ʱ�ȭ try�ȿ��� �����غ���!
		int r1=0;
		int r2=0;
		int r3=0;
		int r4=0;
		try {
			//������ �߻��� ���ɼ��� �ִ� ����
			r1=num1+num2;
			r2=num1-num2;
			r3=num1*num2;
			r4=num1/num2; //���α׷��� 0���� ������ ����!
			}catch (Exception e) {
			//������ �߻������� ó���� ����
			e.printStackTrace();
		    }
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("���α׷� ����...");
	}//main end

}
