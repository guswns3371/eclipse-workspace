package java_test_preparation;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SongWriteFile {
	String fn;

	 SongWriteFile(String fn) {
		this.fn = fn;
	}
	
	void writeSongName() throws Exception {
		Scanner input  = new Scanner(System.in);
		FileOutputStream fo = new FileOutputStream(fn);
		String song_name="",cont="",all_song="";
		
		for(;;) {
			System.out.print("노래 제목을 입력하세요 (50자 이하, ` 문자 제외) :");
			song_name = input.next();
			if(song_name.contains("`") || song_name.length()>50) {
				System.out.println("노래 제목 입력 형식 오류");
				return;
			}
				
			if (song_name.length() < 50) {
				for (;;) {
					song_name += "`";
					if(song_name.length() == 50)
						break;
				}
			}
			all_song += song_name;

			System.out.print("continue? (y/n) :");
			cont = input.next();
			
			if (cont.equals("n")) {
				break;
			}
		}
		
		fo.write(all_song.getBytes());
		
		fo.close();
		input.close();
	}
}
