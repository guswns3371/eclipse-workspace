package hw2;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class test01 {

	//문자열에 대한 해쉬값 구하기
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream in;
		byte[] hash_value = new byte[32]; //sha-256 -> 256비트 = 32바이트
		MessageDigest md = MessageDigest.getInstance("SHA-256"); // sha-256으로 해쉬 값을 구하겠다!
		
		
		try {
			Scanner input  = new Scanner(System.in);
			String fn="";
			System.out.print("파일이름 입력 :");
			fn = input.nextLine();
			
			in = new FileInputStream(fn);
			byte[] in_data = new byte[1000]; 
			int len=0,total=0;
			
			for(;;) {
				len = in.read(in_data);// 파일을 읽을 때 한번에 1000바이트 단위 씩 읽는다
				
				if (len == -1) {
					break;
				}else {
					total += len; // 전체 파일 사이즈가 total에 저장
				}
			}
			
			
			in.close(); // 재활용 불가능
			input.close();
			
			byte[] tot_data = new byte[total]; // 파일의 전체사이즈 만큼 다시 바이트 배열 생성 -> 한번에 읽기 위함
			FileInputStream in2 = new FileInputStream(fn);
			in2.read(tot_data);
			in2.close();
			
			hash_value = md.digest(tot_data);
			
		} catch (IOException e) {
			System.out.println("file open error");
		}
		
		
		//String msg = "It is very interesting to do Java programming!";
		
		
		//hash_value = md.digest(msg.getBytes()); // msg의 해쉬 값이 hase_value 에 저장됨
		
		int i=0;
		for(byte b : hash_value) {
			i++;
			System.out.printf("%02x",b);
			if (i%4 ==0) {
				
				System.out.printf(" ");
			}
		}
		
		
		
		
	}

}
