package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public synchronized void setNum() {
		//����ȭ �������� ���� ����(���� �ϳ��� �����常 �޼��带 ���� ����)
		//����ȭ ��ϼ������� �����尣 ������ ����
		num++;
	}

}
