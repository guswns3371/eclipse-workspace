package hw1;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StWeight S = new StWeight("guswns", 177, 55);
		S.checkStWeight();
		S.displayStWeight();
		
		Calender C = new Calender(1996, 1);
		C.displayMonth();
		
		FileEncrypt AA = new FileEncrypt("school.jpg", "aaa3.jpg", "1234567");
		AA.encryptFile();
		
		FileEncrypt BB = new FileEncrypt("aaa3.jpg", "bbb3.jpg", "1234567");
		BB.encryptFile();
	}

}
