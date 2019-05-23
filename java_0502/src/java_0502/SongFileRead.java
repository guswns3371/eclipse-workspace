package java_0502;

import java.io.FileInputStream;
import java.io.IOException;

public class SongFileRead {
	String fn;
	final int recordSizeByte=60;
	public SongFileRead(String fn) {
		this.fn = fn;
	}
	 
	 public void readSongNameInFile() {
		 
		 FileInputStream in  = null;
		 try {
			in = new FileInputStream(fn);
			byte[] oneRecord = new byte[recordSizeByte];
			int len;
			for(;;) {
				len = in.read(oneRecord);
				if (len == -1) {
					break;
				}
				//System.out.println(oneRecord);
				String tmp = "";
				int songLen = (int) oneRecord[0];
				for (int i = 1; i < songLen+1; i++) {
					tmp += (char) oneRecord[i];
				}
				System.out.println(tmp);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	 }
	
	
}
