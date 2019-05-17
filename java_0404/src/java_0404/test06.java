package java_0404;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class test06 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileHashValue fv =new FileHashValue("school.jpg");
		fv.generateHashValue();
		fv.displayHashValue();
	}

}
class FileHashValue {

	String fn;
	byte[] hash_value = new byte[32];
	boolean hash_ok;

	FileHashValue(String fn)  {
		 this.fn = fn;
		 hash_ok = false;
	}
	 
	 void generateHashValue() throws Exception {
		FileInputStream in = new FileInputStream(fn); //school.jpg 읽어오기 -> byte 단위로 읽어온다
		byte[] data = new byte[100];
		int file_size = 0, len=0;
		
		for(;;) {
			len = in.read(data);
			if(len == -1) {
				break;
			}
			else {
				file_size += len;
			}
				
		}
		 in.close();
		 
		 //다시 파일 읽어라
		 byte[] file = new byte[file_size];
		 FileInputStream in2 = new FileInputStream(fn);
		 in2.read(file);
		
		 
		 MessageDigest md = MessageDigest.getInstance("SHA-256");
		 md.update(file);//해쉬값을 구해 file 베열에 저장해라
		 hash_value = md.digest();
		 
		 in2.close();
		 
		 hash_ok = true;
	 }
	 
	 void displayHashValue() {
		 if (hash_ok) {
			 for(byte i : hash_value) {
				 System.out.printf("%02x",i);
			 }
		}
	 }
}
