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
	final static byte paddingChar = 0x40;

	
	
	 Book(String book_fn) {
		this.book_fn = book_fn;
	}



	 void inputBookInfo() {
//		도서정보 입력
		 String cont = "y";
		 String bookIdx = "",bookName="",bookDae="",bookYea="",bookExp="";
		 byte[] oneRecord = new byte[recordSize];
		 Scanner in = new Scanner(System.in);
		 FileOutputStream out;
		 try {
			 out = new FileOutputStream(book_fn,true);
			 while(cont.compareTo("y") == 0) {
//			index=10 , bookname =30 ,대출자=10 ,예약자 = 10바이트, 반납일=5 >>> 총 60바이트
				 writeAtoZ(in, oneRecord, bookIdx, "책 번호", 0, 10);
				 writeAtoZ(in, oneRecord, bookName,"책 이름", 10, 30);
				 writeAtoZ(in, oneRecord, bookDae, "책 대출자 이름", 40, 10);
				 writeAtoZ(in, oneRecord, bookYea, "책 예약자 이름", 50, 10);
				 writeAtoZ(in, oneRecord, bookExp, "책 반납일", 60, 5);
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
	
	private static void writeAtoZ(Scanner in, byte[] oneRecord, String book_, String book_str, int from, int limit) throws UnsupportedEncodingException {
		 for(;;) {
			 System.out.println(book_str+" ("+limit+"자 이내) : ");
			 book_ = in.nextLine();
			 if (book_.length()<=limit) {
			 	byte[] source = book_.getBytes(StandardCharsets.UTF_8);
				 for (int i = from; i < from+book_.length(); i++) {
//					oneRecord[i] = (byte) book_.getBytes()[(i-from)];
					oneRecord[i] = source[(i-from)];
				}
				 for (int i = from+book_.length(); i < from+limit; i++) {
					oneRecord[i]= paddingChar;
				}
				 byte[] b = new byte[1];
				 for (int i= from; i<from+limit; i++){
					 b[0] = oneRecord[i];
					 System.out.print(new String(b, StandardCharsets.UTF_8));
				 }
				 System.out.println();
				break;
			 }
			 else {
				 System.out.println(book_str+"(이)가 "+limit+"자가 넘습니다");
			 }
		 }
	}
	
	 void readBookInfoFile() {
		 
		 FileInputStream in;
		 try {
			in = new FileInputStream(book_fn);
			byte[] oneRecord = new byte[recordSize];
		 	int len=0,total=0;
		 	for (;;){
				len = in.read(oneRecord);
				if (len == -1)
					break;
				total += len;
			}
			in.close();

		 	in = new FileInputStream(book_fn);
		 	byte[] newrecord = new byte[total];
		 	String[] booklist = new String[total/recordSize];
		 	in.read(newrecord);
			String str = new String(newrecord, StandardCharsets.UTF_8);

			StringBuilder s= new StringBuilder();
			int a=0;
			for (int i =0; i<str.length(); i++){
				s.append(str.charAt(i));
				if ((i+1) % recordSize == 0){
					booklist[a] = s.toString();
					s = new StringBuilder();
					a++;
				}
			}
			 System.out.println(
					 "책 번호   "+" | "+
					 "책 제목                       "+" | "+
					 "대출자    "+" | "+
					 "예약자    "+" | "+
					 "반납일"+"| "
			 );
			 for (String str2: booklist) {
			 	String idx="",name="",dae="",yea="",exp="";
			 	for (int i=0;i<str2.length(); i++){
			 		String A = Character.toString(str2.charAt(i));
			 		if (A.equals("@"))
			 			A=" ";
			 		if (i < 10)
			 			idx += A;
					if (i>=10 && i<40)
						name += A;
					if (i>=40 && i<50)
						dae += A;
					if (i>=50 && i<60)
						yea += A;
					if (i>=60 && i<65)
						exp += A;
				}
				 System.out.println(
				 		idx+" | "+
						name+" | "+
						dae+" | "+
						yea+" | "+
						exp+" | "
				 );
			 }


		 	in.close();

		} catch (IOException e) {
			// TODO: handle exception
		}
	 }

	  void EditBookInfoFile(){

	 }



}
