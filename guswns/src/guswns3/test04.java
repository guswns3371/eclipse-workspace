package guswns3;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] jumsu= {{1,2,3},{5,6,7},{10,12,13},{22,33,44}};
		
		for (int i = 0; i < jumsu.length; i++) {
//			for (int j = 0; j <jumsu[i].length; j++) {
//				System.out.printf("%5d",jumsu[i][j]);
//			}
			
			for(int a: jumsu[i] ) {
				System.out.printf("%4d",a);
			}
			System.out.println();
		}
	}

}
