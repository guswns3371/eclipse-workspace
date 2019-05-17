package guswns;

public class test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sum=0;
			
			int i;
			
			double d , d_sum=0;
			
			for ( i = 0; i <=100; i++) {
				sum = sum+i;
			}
			System.out.println("sum ="+sum);
			
			System.out.println("i ="+i);
			
			for ( d = 0,i=0 ; d <= 3.0; d = d+0.5,i++ ) {
				d_sum += d;
				System.out.println("i="+i+" d="+d);
			}
			
			System.out.println("d ="+d_sum);
	}

}
