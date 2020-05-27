package test06;
/*
 * 날짜 : 2020/05/01
 * 이름 : 이태훈
 * 내용 : 자바 연산자 연습문제
 */
public class JavaTest6 {
	public static void main(String[] args) {
		
		int num = 0;
		int result;
		//대입연산자가 우선으로 적용됨
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
		
	}

}
