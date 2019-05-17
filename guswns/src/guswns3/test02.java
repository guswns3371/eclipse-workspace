package guswns3;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {1,2,3,4,5,6,7};
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%4d",score[i]);
		}
		
		System.out.println();
		score = new int[] { 11,22,33};
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%4d",score[i]);
		}
	}

}
