package p383;

public class Example {
	public static void main(String[] args) {
		
		ChildInterface1 c1 = new ChildInterface1() {
								
			@Override
			public void method3() {
				System.out.println("method3");
			}
		};
		c1.method3();
		
		ChildInterface2 c2 = new ChildInterface2() {
					
			@Override
			public void method1() {
				System.out.println("method1");
			}

			@Override
			public void method3() {
				System.out.println("method3");
			}
		};
		c2.method1();
		c2.method2();
		c2.method3();
		
	}//main end

}
