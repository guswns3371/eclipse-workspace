package java_test_preparation;

import java.io.FileOutputStream;

public class assign04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] data={0x12,0x31,0x24,0x54,0x67,0x23,0x43,0x76,0x12,0x67}; 
		byte[] pwd={0x0a,0x78,0x76,0x54};
		

		FileOutputStream fo = new FileOutputStream("test.bin");
		for (int i = 0; i < data.length; i++) {
			data[i] = (byte) (data[i]^pwd[i%4]);
		}
		System.out.println("---첫번쨰 결과값---");
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%02x ",data[i]);//%02x : byte 출력기호
		}
		fo.write(data);
		fo.close();
		
		System.out.println("\n---두번쨰 결과값---");
		for (int i = 0; i < data.length; i++) {
			data[i] = (byte)(pwd[i%4]^data[i]);
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%02x ",data[i]);
		}
		
		
		
		
	}

}
