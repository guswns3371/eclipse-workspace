package java_0502;

public class test03 {

	public static void main(String[] args) {
		int x=128,n=4;
		double res;
		
		res =  (128*Math.pow(2, 4));
		System.out.println(res);
		
		res = 128<<4; // 왼쪽으로 쉬프트 할때마다 *2 한 것이다.
		System.out.println(res);
		
		res = (128/Math.pow(2, 4));
		System.out.println(res);
		
		res= 128>>4;
		System.out.println(res);
	}
}
