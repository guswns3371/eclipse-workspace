package java_0404;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileHashValue2 {

	String fn;
	byte[] hash_value = new byte[32];
	boolean hash_ok;
	String tmp ="";
	//int file_size=0, len=0;
	 FileHashValue2(String fn)  {
		 this.fn = fn;
		 hash_ok = false;
	}
	 
	 void generateHashValue() throws NoSuchAlgorithmException, IOException {
		FileInputStream in = new FileInputStream(fn); //school.jpg 읽어오기 -> byte 단위로 읽어온다
		byte[] data = new byte[80];
		int file_size = 0, len=0;
		
		for(;;) {
			len = in.read(data);
			if(len == -1) {
				break;
			}
			else {
				file_size += len;
				for(byte i : data) {
					tmp = tmp+i;
				}
			}
				
		}
		System.out.println(tmp);
		 System.out.println("file_size="+file_size); // file_size 가 byte로 나온다  -> 속성가서 확인해봐라 
		 byte[] file = new byte[file_size];
		 
		 for (int i = 0; i < file.length; i++) {
			in.read(file);
		}
		 MessageDigest md = MessageDigest.getInstance("SHA-256");
		 md.update(file);
		 hash_value = md.digest(); 
		 
		 in.close();
	 }
	 
	 void displayHashValue() {
		 if (hash_ok) {
			
		}else {
			
		}
	 }
}
