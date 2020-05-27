package p372;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); <- Vehicle 인터페이스에는 checkFare가 없음
		
		Bus bus1 = (Bus) vehicle; //<- 강제 타입변환
		
		bus1.run();
		bus1.checkFare();
		
	}//main end

}
