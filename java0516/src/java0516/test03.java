package java0516;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit2[] group =  {
			new Marine2(3, 4),
			new Tank2(10, 20),
			new Dorship(14, 19),
			new Marine2(99, 55)
		};
		
		for (int i = 0; i < group.length; i++) {
			group[i].move();
		}
		
	}

}
