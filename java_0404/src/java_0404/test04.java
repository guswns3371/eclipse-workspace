package java_0404;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class test04 {

	static MessageDigest md,md2;
	
	public static void main(String[] args) throws Exception {

		String msg = "Java Programming!!!";
		String msg2 = "java programming!!!";

		byte[] hash_value = new byte[32]; // 256비트 =32 byte <- (hxd) 해쉬 알고리즘 SHA-256에서의 결과값 파일은 항상 256비트
		
		md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes()); // update 에다 byte 단위로 매개변수를 넣어야 한다
		//getBytes() -> String to byte
		hash_value = md.digest();
		
		for(byte i : hash_value) {
			//System.out.printf("%2x",i); // 
			System.out.printf("%02x",i); // %02x : 빈칸이 있으면 0으로 채워라
		}
		System.out.println();
		md2 = MessageDigest.getInstance("SHA-256");
		md2.update(msg2.getBytes());
		hash_value = md2.digest();
		
		for(byte i : hash_value) {
			//System.out.printf("%2x",i); // 
			System.out.printf("%02x",i); // %02x : 빈칸이 있으면 0으로 채워라
		}
	}

}
