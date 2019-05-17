package java0516;

public class Dorship extends Unit2 {

	Dorship(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("송수선 이동 위치 : ("+x+", "+y+")");
	}
	
	void stop() {
		System.out.println("Dorship 정지");
	}
	void unload() {
		System.out.println("내린다");
	}
	void load() {
		System.out.println("태운다");
	}
}
