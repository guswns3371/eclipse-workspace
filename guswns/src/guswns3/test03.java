package guswns3;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {10,20,30,40,50};
		System.out.println("**  main**");
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%4d",score[i]);
		}
		System.out.println();
		
		test(score);
		

		System.out.println("**  main**");
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%4d",score[i]);
		}
		System.out.println();
	}

	public static void test(int[] a) {
		
		System.out.println("** test **");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d",a[i]);
		}
		
		System.out.println();
		
		a[0]=999;
		System.out.println("** test **");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d",a[i]);
		}
		System.out.println();
		
		a = new int[] {60,70}; // 더이상 a는 {999,~~~}방을 가리키기 않고 새롭게 할당된 배열을 가리킨다.
		
		System.out.println("** test **");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d",a[i]);
		}
		System.out.println();
	}
}
