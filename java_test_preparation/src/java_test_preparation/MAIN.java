package java_test_preparation;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileHashValue fh = new FileHashValue("01 Bang.mp3");
//		try {
//			fh.generateHashValue();
//			fh.displayHashValue();
//			System.out.println("\nA1572CFD0774E2AED31008DC6CE62679FB2AA3B5C3092FC2912D5C62BAE41537");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		StWeight sw = new StWeight("하현준", 177.1, 73.6);
//		sw.checkStWeight();
//		sw.displayStWeight();
//		
//		
//		Calender c = new Calender(2019, 2);
//		c.displayCalende();
//		
//		FileEncrypt encrypt = new FileEncrypt("school.jpg", "en_school.jpg", "12345");
//		try {
//			encrypt.encryptFile();
//		} catch (Exception e) {
//			System.out.println("file encyript error");
//			e.printStackTrace();
//		}
//		
//		FileEncrypt encrypt2 = new FileEncrypt("en_school.jpg", "reen_school.jpg", "12345");
//		try {
//			encrypt2.encryptFile();
//		} catch (Exception e) {
//			System.out.println("file encyript error");
//			e.printStackTrace();
//		}
		
		SongWriteFile w = new SongWriteFile("song.bin");
		try {
			w.writeSongName();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SongReadFile r = new SongReadFile("song.bin");
		try {
			r.readSongName();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
