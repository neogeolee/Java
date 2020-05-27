package sub2;
/*
 * 날짜 : 2020/05/20
 * 이름 : 이태훈
 * 내용 : 제네릭 클래스 실습하기 교재 p654
 */
public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 100); //제네릭은 객체만 취급, 그래서 int의 wrapper 형인 Integer 선언
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy 20");
		
		p1.show();
		p2.show();
		
	}//main end

}
