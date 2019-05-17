package java_test_preparation;

import java.io.FileInputStream;
import java.util.Random;

public class SongReadFile {
	String fn;

	 SongReadFile(String fn) {
		this.fn = fn;
	}
	
	void readSongName() throws Exception{
		FileInputStream fin = null;
		fin = new FileInputStream(fn);
		byte[] read = new byte[50];
		
		int len=0,total=0;
		String one_song="",trim_song="";
		for(;;) {
			len = fin.read(read);
//			for (int i = 0; i < read.length; i++) {
//				System.out.printf("%c",read[i]); // byte 는 %c로 읽을 수 있구낭
//			}
//			one_song = new String(read,"UTF-8");
//			for (int i = 0; i < one_song.length(); i++) {
//				String s = Character.toString(one_song.charAt(i));
//				if(!s.equals("`")) 
//					trim_song+=s;
//				
//			}
//			System.out.println(trim_song);
//			trim_song="";
			if(len == -1)
				break;
			else
				total += len;
		}
		fin.close();
		
		fin = new FileInputStream(fn);
		byte[] final_read = new byte[total];
		String[] final_song = new String[total/50];
		fin.read(final_read);
		
		one_song = new String(final_read,"UTF-8");
		
		int j=0;
		String s="";
		for (int i = 0; i < final_read.length; i++) {
			String b = Character.toString(one_song.charAt(i));
			 if (!b.equals("`")) {
				 s+=b;
			 }
			if( (i+1)%50 ==0 ) {
				final_song[j] = s;
				s="";
				
				j++;
			}
				
		}
		fin.close();
		
		for(String string : final_song) {
			System.out.println(string);
		}
		
		System.out.println("----------------------");
		Random R = new Random();
		int[] random = new int[total/50];
		for (int i = 0; i < total/50; i++) {
			random[i] = R.nextInt(total/50);
			for (int k = 0; k < i; k++) {
				if (random[i] == random[k]) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < random.length; i++) {
			System.out.println(final_song[random[i]]);
		}
		
	}
}
