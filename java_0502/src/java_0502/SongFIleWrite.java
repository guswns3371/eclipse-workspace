package java_0502;

import java.io.FileOutputStream;
import java.io.IOException;

public class SongFIleWrite {
	String fn;
	final int recordSizeByte = 50;
	final byte paddingChar = 0x41;
	FileOutputStream out = null;
	 SongFIleWrite(String fn) {
		this.fn = fn;
	}
	
	 void writeSongNameInFile() {
		 String cont = "yes";
		 String songName;
		 byte[] oneRecord = new byte[recordSizeByte];
		 java.util.Scanner in = new java.util.Scanner(System.in);
		 
		 try {
			 out = new FileOutputStream(fn,true);
			 while(cont.compareTo("yes") == 0) {
				 System.out.println("Input Song Name : ");
				 songName = in.nextLine();
				 oneRecord[0] = (byte)(songName.length());
				 
				 for (int i = 1; i <= songName.length(); i++) {
					oneRecord[i] = (byte) songName.charAt(i-1);
					
				}
				 for (int i = songName.length()+1; i <recordSizeByte ; i++) {
					 oneRecord[i] = paddingChar;
				}
				 
				 out.write(oneRecord);
				System.out.println("Continue? (yes/no)"); 
				cont = in.nextLine();
			 }
			 
			 out.close();
		} catch (IOException e) {
			// TODO: handle exception
		}

		 
		 in.close();
	 }
	
}
