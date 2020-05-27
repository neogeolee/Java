package p310;

public class ChildExample {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parents parents = child;
		
		parents.method1();
		parents.method2();
		
		//parents.method3();
		
	}//main end

}
