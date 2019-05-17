package hw2;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SongWriteFile sw = new SongWriteFile("song.bin");
		sw.writeSongName();
		
		SongReadFile sr =new SongReadFile("song.bin");
		sr.readSongName();
		
	}

}
