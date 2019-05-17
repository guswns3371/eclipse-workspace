package java_test_preparation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.MessageDigest;

public class FileEncrypt {

	String i_fn,o_fn,pwd;
	FileOutputStream fo;
	FileInputStream fi;
	
	FileEncrypt(String i_fn, String o_fn, String pwd) {
		this.i_fn = i_fn;
		this.o_fn = o_fn;
		this.pwd = pwd;
	}
	
	void encryptFile() throws Exception{
		
			fo = new FileOutputStream(o_fn);
			fi = new FileInputStream(i_fn);
			
			byte[] read = new byte[100];
			int len=0,total=0;
			
			for(;;) {
				len = fi.read(read);
				
				if (len == -1) {
					break;
				}else {
					total += len;
				}
			}
			fi.close();
			byte[] final_read = new byte[total];
			byte[] hash_val = new byte[32];
			fi = new FileInputStream(i_fn);
			
			fi.read(final_read);
			fi.close();
			
			hash_val = final_read;
			
			for (int i = 0; i < hash_val.length; i++) {
				hash_val[i] = (byte)(hash_val[i]^pwd.getBytes()[i%pwd.length()]);
			}
			
			fo.write(hash_val);
			fo.close();
	}
}
