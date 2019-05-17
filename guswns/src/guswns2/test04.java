package guswns2;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pie=0;
		boolean isPlus = true;
		for (int i = 0; i <100000; i++) {
			pie += Math.pow(-1, i)/(2*i+1);
		}
		pie = 4*pie;
		System.out.println("pie="+pie);
		
		pie=0;
		for (double i = 1.0; i <=100000.0; i=i+2.0) {
			if (isPlus) {
				pie += (1.0/i);
				isPlus = false;
			}else {
				pie -= (1.0/i);
				isPlus = true;
			}
		}
		pie = 4*pie;
		
		System.out.println("pie="+pie);
	}

}
