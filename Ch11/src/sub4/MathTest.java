package sub4;
/*
 * ��¥ : 2020/05/18
 * �̸� : ������
 * ���� : Math Ŭ���� �ǽ��ϱ� ���� p533
 */
public class MathTest {
	public static void main(String[] args) {
		
		//Math m = new Math();  Math�� �̱��水ü�� �� ������ ����� �� ����
		
		System.out.println("PI�� : "+Math.PI);
		System.out.println("���밪 : "+Math.abs(-5));
		System.out.println("���밪 : "+Math.abs(-3.14));
		System.out.println("������ : "+Math.sqrt(9));
		System.out.println("�ø��� : "+Math.ceil(1.2));
		System.out.println("�ø��� : "+Math.ceil(1.8));
		System.out.println("������ : "+Math.floor(1.2));
		System.out.println("������ : "+Math.floor(1.8));
		System.out.println("�ݿø� : "+Math.round(1.2));
		System.out.println("�ݿø� : "+Math.round(1.8));
		
		//random
		double num1 = Math.random();
		System.out.println("num1 : "+num1);
		
		double num2 = num1*10; 
		System.out.println("num2 : "+num2); //0~10 ���̿� �Ǽ�
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3); //1~10���̿� ����
		
		double lotto = Math.ceil(Math.random()*45); //1~45���̿� ����
		System.out.println("lotto : "+lotto);
		
	}//main end

}