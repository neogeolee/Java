package sub4;
/*
 * 날짜 : 2020/05/18
 * 이름 : 이태훈
 * 내용 : Math 클래스 실습하기 교재 p533
 */
public class MathTest {
	public static void main(String[] args) {
		
		//Math m = new Math();  Math는 싱글톤객체라서 이 구조를 사용할 수 없음
		
		System.out.println("PI값 : "+Math.PI);
		System.out.println("절대값 : "+Math.abs(-5));
		System.out.println("절대값 : "+Math.abs(-3.14));
		System.out.println("제곱근 : "+Math.sqrt(9));
		System.out.println("올립값 : "+Math.ceil(1.2));
		System.out.println("올립값 : "+Math.ceil(1.8));
		System.out.println("내립값 : "+Math.floor(1.2));
		System.out.println("내립값 : "+Math.floor(1.8));
		System.out.println("반올림 : "+Math.round(1.2));
		System.out.println("반올림 : "+Math.round(1.8));
		
		//random
		double num1 = Math.random();
		System.out.println("num1 : "+num1);
		
		double num2 = num1*10; 
		System.out.println("num2 : "+num2); //0~10 사이에 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3); //1~10사이에 정수
		
		double lotto = Math.ceil(Math.random()*45); //1~45사이에 정수
		System.out.println("lotto : "+lotto);
		
	}//main end

}
