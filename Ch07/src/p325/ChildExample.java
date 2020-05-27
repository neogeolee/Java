package p325;

public class ChildExample {
	public static void main(String[] args) {
		
		Parents parents = new Child();
		parents.field1="data1";
		parents.method1();
		parents.method2();
		/*
		 * parents.field2="data2";
		 * parents.method3();
		 * !!ºÒ°¡´É!!
		 */
		
		Child child = (Child)parents;
		child.field2="yyy";
		child.method3();
		
	}//main end

}
