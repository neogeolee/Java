package sub1;

import sub1.Outer.Inner;

/*
 * ��¥ : 2020/05/14
 * �̸� : ������
 * ���� : ��øŬ���� �ǽ��ϱ� ���� p390
 */
public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(10);
		out.info();
		
		//Inner inner = new Inner(20); -�ƿ��� Ŭ������ ���� �����������
		Inner inner = out.new Inner(20);
		inner.info();
		
	}//main end

}
