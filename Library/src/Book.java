import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Book {
	String book_fn;
	final int recordSize = 65;
//	index=10 , bookname =30 , 대출(데출자, 반납일)=10, 예약 =10바이트 => 총 50바이트
	byte[] oneLine = new byte[recordSize];
	final static byte paddingChar = 0x41;
	FileOutputStream out = null;
	
	
	 Book(String book_fn) {
		this.book_fn = book_fn;
	}



	public void inputBookInfo() {
//		도서정보 입력
		 String cont = "y";
		 String bookIdx = "",bookName="",bookDae="",bookYea="",bookExp="";
		 byte[] oneRecord = new byte[recordSize];
		 Scanner in = new Scanner(System.in);
		 
		 try {
			 out = new FileOutputStream(book_fn,false);
			 while(cont.compareTo("y") == 0) {
//			index=10 , bookname =30 , 대출(대출자=10, 반납일=5) = 15, 예약 =10바이트 => 총 60바이트

				 writeAtoZ(in, oneRecord, bookIdx, "책 번호", 0, 10);
				 writeAtoZ(in, oneRecord, bookName,"책 이름", 9, 30);
				 writeAtoZ(in, oneRecord, bookDae, "책 대출자 이름", 39, 10);
				 writeAtoZ(in, oneRecord, bookYea, "책 예약자 이름", 49, 10);
				 writeAtoZ(in, oneRecord, bookExp, "책 반납일", 59, 5);
				 out.write(oneRecord);
				System.out.println("Continue? (y/n)");
				cont = in.nextLine();
			 }
			 
			 out.close();
		} catch (IOException e) {
			// TODO: handle exception
		}

		 
//		 in.close();
	}
	
	static void writeAtoZ(Scanner in, byte[] oneRecord, String book_,String book_str,int from,int limit) throws UnsupportedEncodingException {
		 for(;;) {
			 System.out.println(book_str+" ("+limit+"이내) : ");
			 book_ = in.nextLine(); 
			 if (book_.length()<=limit) {
				 for (int i = from; i < from+book_.length(); i++) {
					oneRecord[i] = (byte) book_.charAt(i-from);
				}
				 for (int i = from+book_.length(); i <from+limit; i++) {
					oneRecord[i]= paddingChar;
				}
				 byte[] b = new byte[1];
				 for (int i= from; i<from+limit; i++){
					 b[0] = oneRecord[i];
					 System.out.print(new String(b, StandardCharsets.UTF_8));
				 }
				break;
			 }
			 else {
				 System.out.println(book_str+"(이)가 "+limit+"자가 넘습니다");
			 }
		 }
	}
	
	 public void readSongNameInFile() {
		 
		 FileInputStream in  = null;
		 try {
			in = new FileInputStream(book_fn);
			byte[] oneRecord = new byte[recordSize];
			in.read(oneRecord);
			String str = new String(oneRecord,"utf-8");
			System.out.println(str);
		 	in.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	 }
	
}
