package guswns;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a =0x7f;
		short b = 0x7fff;
		int c = 0x7fffffff;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		a=(byte) (a+1);
		b=(short) (b+1);
		c=c+1;
		// 표현 범위를 초과하면 그 범위 안을 돌게 되므로 최솟값이 나온다.
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		c=0xffffffff;
		System.out.println("c="+c);
	}

}
