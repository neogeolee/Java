package test10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ��¥ :2020/05/22
 * �̸� : ������
 * ���� : ��Ʈ�� �������� 
 * 
 * ��ü�� ����ȭ
 * 	- �ڹ��� ��ü�� ��Ʈ���� ���� �ܺ� ���Ϸ� �����ϱ� ���� �۾��̴�.
 * 	- ��Ʈ������ ���۵� ��ü�� Serializable �������̽��� �����Ѵ�
 * 	- �ܺ��� ��ü������ �ٽ� �ڹ� ��ü�� �����ϴ� ���� ������ȭ��� �Ѵ�.
 */
public class JavaTest10 {
	public static void main(String[] args) throws IOException{
		
		Apple apple1 = new Apple("�ѱ�", 3000);
		Apple apple2 = new Apple("�̱�", 3000);
		
		FileOutputStream fos = new FileOutputStream("./apple.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//���� ������Ʈ ���� ������ apple.txt ��ü���� ����(����ȭ)
		oos.writeObject(apple1);
		oos.writeObject(apple2);
		
		//��Ʈ������
		oos.close();
		fos.close();
				
		System.out.println("���������� apple.txt ��ü���� �����Ϸ�!");
		
	}//main end

}
