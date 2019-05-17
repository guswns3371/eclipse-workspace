package guswns3;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("[3,5]="+getMax(3,5));
		
		System.out.println("[3.4,5.3]="+getMax(3.4,5.3));
	}

	private static int getMax(int a, int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}

	private static double getMax(double a, double b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
}
