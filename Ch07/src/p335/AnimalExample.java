package p335;

public class AnimalExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("---------");
		
		//변수로 자동변환 타입
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("----------");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
				
	}//main end
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
