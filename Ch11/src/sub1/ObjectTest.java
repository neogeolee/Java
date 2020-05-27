package sub1;
/*
 * 날짜 : 2020/05/18
 * 이름 : 이태훈
 * 내용 : Object 클래스 실습하기 교재 p457
 * 
 * Object 클래스
 *  - 자바의 최상위 클래스
 *  - 모든 클래스의 부모클래스로 다형성 적용에 활용된다.
 *   
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		// 다형성에 활용되는 Object 클래스
		Object obj1 = new Apple("한국", 3000);
		Object obj2 = new Apple("일본", 2000);
		Object obj3 = new Banana("대만", 2500);
		Object obj4 = new Banana("중국", 1500);
		
		//a1.info();
		//b1.info();
		  //object 클래스에는 info 메서드가 없음. 내장클래스이기 때문에 우리가 메서드를 정의할 수없음 그래서 캐스팅문법을 사용해야함
		
		//다운캐스팅
		Apple a1 = (Apple)obj1;
		Banana b3 = (Banana)obj3;
		
		a1.info();
		b3.info();
		
		Object fruit[] = {obj1,obj2,obj3,obj4}; 
		
		Apple a2 = (Apple)fruit[1];
		a2.info();
		
		Banana b4 = (Banana)fruit[3];
		b4.info();
		
		//to String을 쓰면 다운캐스팅 필요없음(object에 있는걸 오버라이딩 한거임 )
		obj1.toString();
		obj2.toString();
				
	}//main end

}
