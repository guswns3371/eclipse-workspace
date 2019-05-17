package java0516;

public class Tank2 extends Unit2{

	Tank2(int x, int y) {
		super(x, y);
	}

	@Override
	void move() {	
		System.out.println("탱크의 현재 위치"+" ("+x+", "+y+")");
	}
	
	void stop() {
		System.out.println("Tank 정지");
	}
}
