package p314;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation){
			System.out.println(location+"KumhoTire ¼ö¸í : "+(maxRotation-accumlatedRotation)+"È¸");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire ÆãÅ©***");
			return false;
		}

	}
}
