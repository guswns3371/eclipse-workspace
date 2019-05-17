package java0516;

public class Marine2 extends Unit2 {

	Marine2(int x, int y) {
		super(x, y); 
	}

	@Override
	void move() {
		System.out.println("Marine2 이동");
	}
	
	void stimpack() {
		System.out.println("스팀팩을 사용한다.");
	}
	
}
