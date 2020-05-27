package p314;

public class Tire {
	//필드
	public int maxRotation;
	public int accumlatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명 : "+(maxRotation-accumlatedRotation)+"회");
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
		return false;
		
	}

}
