package p299;

public class SuperSonicAirplane extends Airplane{
	
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			//Airplane 개체의 fly 호출
			super.fly();
		}
	}

}
