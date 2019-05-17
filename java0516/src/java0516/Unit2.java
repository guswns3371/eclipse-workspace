package java0516;

public abstract class Unit2 {
	int x,y;

	 Unit2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	 abstract void move();
	 void stop () {
		 System.out.println("현 위치에서 멈춤");
	 }
}
