package test03;
/*
 * ��¥ : 2020/05/22
 * �̸� : ������
 * ���� : String Ŭ���� ��������
 */
public class JavaTest3 {
	public static void main(String[] args) {
		
		String filename = "�ڹټ�����.hwp";
		
		int idx = filename.indexOf('.');
			
		String title = filename.substring(0,idx);
		String ext = filename.substring(idx+1);
		
		System.out.println("���ϸ� : "+title);
		System.out.println("Ȯ���� : "+ext);
	}//main end

}
