package guswns3;

public class test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(1,2));
		System.out.println(getSum(1,2,3,4,5));
		System.out.println(getSum(8,9,6,5,4,8));
	}

	private static int getSum(int...a) {
		//int...a 처럼 매개변수에 ...을 붙히면 매개변수의 개수가 가변적으로 변한다.

		int sum =0;
		for(int i : a) {
			sum+=i;
		}
		return sum;
	}

}
