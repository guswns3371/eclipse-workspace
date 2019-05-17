package java0516;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] arUnit = {new Marine(), new Zealot(), new Mutal()};
		
		for(Unit u : arUnit) {
			u.move();
			u.attack();
		}
		System.out.println("------");
		
//		Unit a = new Unit();
//		a.move();
//		a.attack();
		
		
	}

}
