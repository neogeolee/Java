package test01;

/*
 * 날짜 : 2020/05/01
 * 이름 : 이태훈
 * 내용 : 자바 데이터 타입 연습문제
 */
public class JavaTest1 {
	public static void main(String[] args) {
		char    var1 = 'A';
		int     var2 = 100;	
		long    var3 = 214783648L;
		float   var4 = 3.14f;
		double  var5 = 3.14159;
		boolean var6 = true;
		boolean var7 = false;
		String  var8 = "Hello";
		String  var9 = null; //객체를 초기화 하는 값 기본타입은 null 값은 취급못함. Object도 되던데 흠
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("var9 : "+var9);
	}

}
