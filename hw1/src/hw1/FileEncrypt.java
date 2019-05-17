package hw1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileEncrypt {
	String i_fn,o_fn,pwd;

	 FileEncrypt(String i_fn, String o_fn, String pwd) {
		this.i_fn = i_fn;
		this.o_fn = o_fn;
		this.pwd = pwd;
	}
	
	void encryptFile() throws Exception {
		byte[] i_data = new byte[100];
		byte[] pwd_b;
		pwd_b = new byte[pwd.length()];
		pwd_b= pwd.getBytes();
		
		FileInputStream in  = new FileInputStream(i_fn); // 파일 읽기
		FileOutputStream out = new FileOutputStream(o_fn);
		for (;;) {
			int len = in.read(i_data); // 파일을 읽는다
			if (len == -1) {
				break;
			}else {
				int i =0;
				for (byte b : i_data) {
					i_data[i] = (byte)(b^pwd_b[i%(pwd_b.length)]);// pwd길이만큼 계속 반복한다
					//pwd =123이고 i_data 길이가 10이라면 , 123 123 123 1
					// 원본^b = 암호화된파일 -> 암호화된파일^b = 원본  의 원리로 파일 암호를 풀 수 있다
					i++;
				}
				out.write(i_data); // 파일을 out을 통해 쓴다. -> 대상 파일이 생성된다 , 암호화된 파일
			}
		}
		
		
		in.close();
		out.close();
	}
}
