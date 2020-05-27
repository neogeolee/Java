package sub2;

public class SmartTV extends TV implements Computer{

	@Override
	public void booting() {
		System.out.println("SmarTV booting");
	}

	@Override
	public void internet() {
		System.out.println("SmarTV internet");
	}
	
}
