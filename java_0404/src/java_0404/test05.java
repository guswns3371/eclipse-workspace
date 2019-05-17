package java_0404;
import java.io.*;
public class test05 {

	public static void main(String[] args) throws Exception{
		//파일을 읽어 그 크기를 알아보는 예제
		FileInputStream in = new FileInputStream("school.jpg"); //school.jpg 읽어오기 -> byte 단위로 읽어온다
		byte[] data = new byte[200];
		int file_size = 0, len=0;
		
		
		//len = in.read(data);// 읽은 데이터의 바이트 수를 len에 널어준다 , -1반환 : 더이상 읽을 내용이 없다
		
		for(;;) {
			len = in.read(data);
			if(len == -1)
				break;
			else
				file_size += len;
		}
		System.out.println("file_size="+file_size); // file_size 가 byte로 나온다  -> 속성가서 확인해봐라
		for(byte i : data) {
			System.out.printf("%02x",i);
		}
		in.close();
		
		
	}

}
