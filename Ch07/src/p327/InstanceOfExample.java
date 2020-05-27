package p327;

public class InstanceOfExample {
	
	public static void method1(Parents parents) {
		if(parents instanceof Child) {
			Child child = (Child) parents;
			System.out.println("method1 - Child�� ��ȯ ����");
		}else {
			System.out.println("Child�� ��ȯ��������");
		}
	}
	
	public static void method2(Parents parents) {
		Child child = (Child) parents;
		System.out.println("method2 - Child�� ��ȯ����");
	}
	
	public static void main(String[] args) {
		
		Parents parentsA = new Child();
		method1(parentsA);
		method2(parentsA);
		
		Parents parentsB = new Parents();
		method1(parentsB);
		method2(parentsB);
		
	}//main end

}
