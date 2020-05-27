package sub1;

public class StockAccount extends Account{
						  //부모클래스 호출
	private String stock;
	private int amount;
	private int price;
                 //부모클래스 초기화                                                                              //자식 클래스 초기화   	
	StockAccount(String bank, String id, String name, int money, String stock, int amount, int price) {
		super(bank, id, name, money); //부모클래스 생성자 호출
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}	
	public void sell(int amount) {
		this.amount -= amount;
	}
	public void buy(int amount) {
		this.amount += amount;
	}
	public void info() {
		System.out.println("==============");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("예금주: "+name);
		System.out.println("현재잔액 : "+money);
		System.out.println("주식종목: "+stock);
		System.out.println("주식수량 : "+amount);
		System.out.println("주식가격 : "+price);
	}

}
