package test06;
/*
 * 날짜 : 2020/05/22
 * 이름 : 이태훈
 * 내용 : 자바 API클래스 연습문제
 */
public class JavaTest6 {
	public static void main(String[] args) {
		
		JavaTest6 test = new JavaTest6();
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("필리핀", 2000);
		Grape grape = new Grape("미국", 3000);
		
		test.showinfo(apple);
		test.showinfo(banana);
		test.showinfo(grape);
		
		
	}//main end
	
	public void showinfo(Object fruit) {
		
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			apple.show();
			
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			banana.show();
		}else if(fruit instanceof Grape){
			Grape grape = (Grape) fruit;
			grape.show();
		}
	}

}
