package java_0404;

public class test01 {

	public static void main(String[] args) {

		Car car= new Car("Korando..");
		Car eq = new Car("에쿠스");
		
		System.out.println(Car.num+"대의 차가 출고됨~~~~");
		System.out.println(car.name);
		car.name = "KorandoC";
		System.out.println(car.name);
		car.run();
		car.gasoline = true;
		car.run();
		car.stop();
		
		System.out.println(eq.name);
		eq.name="Eqqus";
		System.out.println(eq.name);
		
	}

}
class Car{
	String name;
	boolean gasoline;
	static int num =0;
	
	 Car(String name) {
		// TODO Auto-generated constructor stub
		num++;
		this.name = name;
		displayNum();
	}
	
	void displayNum() {
		System.out.println(num+"대의 차가 출고됨!!!");
	}
	
	void run() {
		if (gasoline) {
			System.out.println("부릉부릉");
		}else {
			System.out.println("덜컹덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}
