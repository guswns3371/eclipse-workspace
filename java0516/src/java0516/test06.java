package java0516;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}
	static void method() {
		submethod();
	}
	 static void submethod() {
		 int a=10,b=0,c;
		 try {
			c =a/b;
			System.out.println("c="+c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
