package hw2;

import java.io.FileInputStream;
import java.io.IOException;

public class test06 {

	//저장된 파일을 읽는 코드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in =null;
		
		try {
			in = new FileInputStream("song.bin");
			byte[] inLine = new byte[50];
			int len=0;
			String song_name;
			
			for(;;) {
				len = in.read(inLine);
				
				if (len == -1) {
					break;
				}
				
				song_name = new String(inLine,"utf-8"); //utf-8 로 인코딩
				System.out.println(song_name);
			}
			
			in.close();
		} catch (IOException e) {
			System.out.println("File Open Error");
		}
	}

}
