package hw2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SongWriteFile {
	
	String fn;

	SongWriteFile(String fn) {
		this.fn = fn;
	}
	
	void writeSongName() {
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream(fn); // 파일을 출력(저장)할 때 song.bin 파일로 출력 -> write 시 덮혀 씌어진다
//			out = new FileOutputStream(fn,true);//write 시 append 된다
			String cont = "yes";
			Scanner in = new Scanner(System.in);
			String song_name="";
			byte[] outLine= new byte[50]; // 50바이트를 꽉채워서 노래를 저장해야한다. 내가 알수 있도록 알고리즘 짜야한다.
			
			
			while (cont.compareTo("yes") == 0) {// true
				System.out.print("노래이름 입력 : ");
				song_name=in.nextLine(); 
				
				if (song_name.length()<50) {
					for(;;) {
						if (song_name.length()==50) {
							break;
						}else {
							song_name+="*";
						}
					}
				}else if(song_name.length()>50) {
					System.out.println("노래이름의 길이가 50보다 크면 안됩니다.");
					return;
				}
				outLine = song_name.getBytes();
				out.write(outLine);// 입력받은 노래이름을 파일에 출력한다
				// 한번에 50 바이트 만큼 쓰는게 아니고 입력 받은 만큼만 쓴다.
				
				System.out.print("Continue? (yes/no) ");
				cont = in.nextLine();
			}
			
			
			out.close();
			in.close();
		} catch (IOException e) {
			System.out.println("File Open Error");
		}
	}
}
