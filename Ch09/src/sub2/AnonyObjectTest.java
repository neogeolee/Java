package sub2;
/*
 * 날짜 : 2020/05/14
 * 이름 : 이태훈
 * 내용 : 익명클래스 실습하기 교재 p404
 */
public class AnonyObjectTest {
	public static void main(String[] args) {
		
		//익맹개체 - 인터페이스를 클래스 구현없이 바로 new연산으로 객체를 생성하는 것
		Person p = new Person() {
			
			@Override
			public void info() {
				System.out.println("Person info...");
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
			}
		};
		
		p.info();
		p.hello();
		
	}//main end

}
