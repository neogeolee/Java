package test03;
/*
 * 날짜 : 2020/05/22
 * 이름 : 이태훈
 * 내용 : String 클래스 연습문제
 */
public class JavaTest3 {
	public static void main(String[] args) {
		
		String filename = "자바수행평가.hwp";
		
		int idx = filename.indexOf('.');
			
		String title = filename.substring(0,idx);
		String ext = filename.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
	}//main end

}
