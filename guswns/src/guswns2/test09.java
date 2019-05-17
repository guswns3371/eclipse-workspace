package guswns2;

import java.io.FileOutputStream;

public class test09 {

	public static void main(String[] args) throws Exception{
		byte[] data = {0x12,0x13,0x23,0x24,0x34,0x35,0x45,0x46,0x56,0x57};
		FileOutputStream out = new FileOutputStream("test.bin"); // test.bin 은 바이너리 형태
		//자바 작업폴더에 생김 C:\Users\guswn\eclipse-workspace\guswns
		
		out.write(data);
		out.close();
		
		System.out.println("파일생성완료");
	}

}
