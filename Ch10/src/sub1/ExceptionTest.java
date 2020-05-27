package sub1;
/*
 * 날짜 : 2020/05/14
 * 이름 : 이태훈
 * 내용 : 예외처리 실습하기 교재 p422
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		int num1=1;
		int num2=0;
		// try안에서 선언하면 범위가 try안으로 한정됨으로 밖에서 선언,초기화 try안에서 참조해보림!
		int r1=0;
		int r2=0;
		int r3=0;
		int r4=0;
		try {
			//에러가 발생할 가능성이 있는 로직
			r1=num1+num2;
			r2=num1-num2;
			r3=num1*num2;
			r4=num1/num2; //프로그램은 0으로 못나눔 에러!
			}catch (Exception e) {
			//에러가 발생했을때 처리할 로직
			e.printStackTrace();
		    }
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("프로그램 종료...");
	}//main end

}
