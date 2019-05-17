package java0418;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Dog dog = new Dog();
		Dove dove = new Dove();
		
		animal.move();
		dog.move();
		dove.move();
		
		System.out.println("******************");
		testAnimal(dog);
		System.out.println("******************");
		testAnimal(dove);
	}
	
	static void testAnimal(Animal animal) {
		animal.move();
		//다운 캐스팅 안전하게 하는 방법
		if (animal instanceof Dog) {
			Dog my_dog = (Dog) animal;
			my_dog.bark();
		}
		
		if (animal instanceof Dove) {
			Dove my_dove = (Dove) animal;
			my_dove.fly();
		}
	}

}
