package java0516;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=2;
		b=10;
		int[] ar = {1,2,3,4,5};
		
		try {
			c= a/b;
			System.out.println("c="+c);
			ar[5] = 100;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+"/ 0으로 나누기 예외");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+"/ 배열범위 오류");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+"/ 일반적 오류");
		}
		
		System.out.println("프로그램 실행 완료");
	}

}
