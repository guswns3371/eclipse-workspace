package java_test_preparation;

import java.io.FileInputStream;
import java.security.MessageDigest;

public class FileHashValue {

	String fn;
	byte[] hash_value = new byte[32];
	boolean hash_ok;
	FileInputStream in;
	
	FileHashValue(String fn) {
		this.fn = fn;
		hash_ok = true;
	}
	
	void generateHashValue() throws Exception{
		in = new FileInputStream(fn);
		byte[] one_read = new byte[100];
		int total=0,len;
		for(;;) {
			len = in.read(one_read);
			
			if (len == -1) {
				break;
			}else {
				total +=len;
			}
		}
		in.close();
		byte[] final_read = new byte[total];
		in = new FileInputStream(fn);
		in.read(final_read);
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");//암호화
		md.update(final_read); // 해쉬값 업데이트
		hash_value = md.digest();
		
	}
	
	void displayHashValue() {
		for(byte b : hash_value) {
			System.out.printf("%02X",b);
		}
	}
}
