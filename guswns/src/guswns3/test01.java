package guswns3;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		int[] jumsu;
		jumsu = new int[3];
		
//		int[] jumsu  = new int[] {99,88,77,66,55,44,33,22,11};
		
		System.out.println("score="+score);
		System.out.println("jumsu[0]="+jumsu[0]);
		System.out.println("jumsu.length="+jumsu.length);
		
		jumsu[0]=100;
		jumsu[1]=99;
		jumsu[2]=88;
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println("jumsu["+i+"]="+jumsu[i]);
		}
		
		
		
	}

}
