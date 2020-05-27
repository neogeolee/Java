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
		//vehicle.checkFare(); <- Vehicle �������̽����� checkFare�� ����
		
		Bus bus1 = (Bus) vehicle; //<- ���� Ÿ�Ժ�ȯ
		
		bus1.run();
		bus1.checkFare();
		
	}//main end

}
