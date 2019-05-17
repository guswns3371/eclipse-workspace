package guswns2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class test11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] data = {0x12,0x31,0x24,0x54,0x67,0x23,0x43,0x76,0x12,0x67};
		byte[] pwd={0x0a,0x78,0x76,0x54};
		
		System.out.println("data :");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%02x  ",data[i]);
		}
		System.out.printf("\n");
		
		System.out.println("pwd :");
		for (int i = 0; i < 4; i++) {
			System.out.printf("%02x  ",pwd[i]);
		}
		
		System.out.printf("\n\n***************************************\n");
		System.out.println("첫번째 실행 결과값 :");
		for (int i = 0; i < 10; i++) {
			data[i]=(byte)(data[i]^pwd[(i%4)]);
			System.out.printf("%02x  ",data[i]);
		
		}
		
		FileOutputStream out = new FileOutputStream("test.bin");
		
		out.write(data);
		out.close();
		
		System.out.println("\n\n첫번째 실행 결과값 파일로 출력완료!!!!");
		System.out.printf("\n***************************************\n");
		System.out.println("두번째 실행 결과값 :");
		for (int i = 0; i < 10; i++) {
			data[i]=(byte) (pwd[(i%4)]^data[i]); 
			
			System.out.printf("%02x  ",data[i]);
		}
	}

}
