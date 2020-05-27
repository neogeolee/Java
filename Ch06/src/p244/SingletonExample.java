package p244;

public class SingletonExample {
	public static void main(String[] args) {
		
		/*
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 * ƒƒ∆ƒ¿œ ø°∑Ø!
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("∞∞¿∫ΩÃ±€≈Ê ∞¥√º¿‘¥œ¥Ÿ.");
		}else {
			System.out.println("¥Ÿ∏•ΩÃ±€≈Ê ∞¥√º¿‘¥œ¥Ÿ.");
		}
		
	}//main end

}
