package p242;

public class Car {
	
	public int speed;
	
	public void run() {
		System.out.println(speed+"���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.speed=60;
		myCar.run();
				
	}//main end


}