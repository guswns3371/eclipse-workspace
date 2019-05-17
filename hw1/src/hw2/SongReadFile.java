package hw2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class SongReadFile {

	String fn;

	 SongReadFile(String fn) {
		this.fn = fn;
	}
	
	void readSongName() {

		FileInputStream in =null;
		FileInputStream in2 =null;
		try {
			in = new FileInputStream(fn);
			byte[] inLine = new byte[50];
			int len=0,total=0;
			String song_name,sn="";
			String song_name2,sn2="";
			int song_num=0;
			for(;;) {
				
				len = in.read(inLine);
				
				if (len == -1) {
					break;
				}
				total+=len;
				song_name = new String(inLine,"utf-8"); //utf-8 로 인코딩
				for (int j = 0; j < 50; j++) {
					String c = Character.toString(song_name.charAt(j));
					if (c.equals("*")) {
						song_num++;
						break;
					}
				}
				
			}
			
			in.close();
			
			/** */
			byte[] inLine2 = new byte[total];
			String[] song_list = new String[song_num];
			in2 = new FileInputStream(fn);
			in2.read(inLine2);
			song_name2 = new String(inLine2,"utf-8");
			
			int a=0;
			for(;;) {		
				for (int j = 1; j < (50*song_num+1); j++) {
					String c = Character.toString(song_name2.charAt(j-1));
					if (!c.equals("*")) 
						sn2+=c;
					
					if (j%50==0 ) {
						song_list[a] = sn2;
						a++;
						sn2="";
					}
				}
				
				if (a == song_num) 
					break;
				
			}
			
			System.out.println("---- "+song_num+"개의 노래 임의 재생 목록 ----");
			int[] randoms = new int[song_num];
			Random R = new Random();
			for (int A = 0; A < song_num; A++) {
				randoms[A] = R.nextInt(song_num); // 난수 발생
				for (int j = 0; j < A; j++) {
					if (randoms[A]==randoms[j]) {
						A--;
					}
				}
			}
			
			for (int B = 0; B < song_num; B++) {
				System.out.println((B+1)+"번째 노래 : "+song_list[randoms[B]]);
			}
				

			
			in2.close();
		} catch (IOException e) {
			System.out.println("File Open Error");
		}
	}
}
