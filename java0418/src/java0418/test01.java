package java0418;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.move();
		dog.bark();
		dog.move();
		System.out.println();
		
		Animal tmp = new Dog();
		tmp.move();
//		tmp.bark(); 얘는 불가능	
	
//		Dog tmp2 = new Animal(); 얘 도 불가능
		//업 캐스팅 : 항상 안전  , 캐스팅 필요 없다
		
		
		//다운 캐스팅 : 위험하다
		Dog tmp2 = (Dog) animal; //  동적 바인딩
		tmp2.move();
		tmp2.bark();
		//에러가 난다
	}
	
	

}
