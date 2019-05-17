package guswns2;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d_rnum=0.0;
		int i_rnum;
		for (int i = 0; i <=10; i++) {
			d_rnum= Math.random();
			i_rnum =(int)(d_rnum*1000)%6+1;
//			System.out.println(d_rnum);
			System.out.println(i_rnum);
		}
	}

}
