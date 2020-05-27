package sub2;

public class Account {
	
	//특성(멤버변수)
	// - 접근권한 private 선언으로 무조건 캡슐화한다.
	private String bank;
	private String id;
	private String name;
	private int money;
	
	//생성자  : 객체를 생성할 때 멤버변수를 초기화 하는 매서드
	Account(String bank, String id, String name, int money){
		this.bank=bank;
		this.id=id;
		this.name=name;
		this.money=money;
	}
	//기능(메서드)
	public void deposit(int money) {
		this.money += money;
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		System.out.println("=================");
		System.out.println("은 행 명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("예 금 주 : "+name);
		System.out.println("현재잔액 : "+money);
	}

}
