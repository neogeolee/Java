package sub2;
/*
 * 날짜 : 2020/05/07
 * 이름 : 이태훈
 * 내용 : 자바 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행", "121-12-1234", "김춘추", 10000);//private 선언으로 캡슐화 했기 때문에 생성자 양식에 맞춰서 객체생성 및 초기화해줌
		
		//입금, 출금, 조회
		kb.deposit(10000);
		kb.withdraw(5000);
		kb.info();
		
		//신한은행 객체생성 및 초기화
		Account sh = new Account("신한은행", "121-11-1234", "김유신", 30000);
		
		//입금, 출금, 조회하기
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
			
		
	}//main end

}
