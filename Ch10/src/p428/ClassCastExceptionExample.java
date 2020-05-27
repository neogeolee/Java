package p428;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}//main end
	
	public static void changeDog(Animal animal) {
		//if(animal instaceof Dog){
		Dog dog = (Dog) animal;		//ClassCastException 발생가능
		//}
	}
}

	class Animal{}
	class Dog extends Animal{}
	class Cat extends Animal{}



