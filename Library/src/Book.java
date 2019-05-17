
public class Book {
	String name,author;
	boolean isOccupied = false;
	int num,occupied_num=0,index;
	
	public Book(int index, String name, String author, int num) {
		this.index = index;
		this.name = name;
		this.author = author;
		this.num = num;
	}
	void intro() {
		System.out.print("[책] "+index+". "+name+" | "+author+" : ");
	}
	void 책정보() {
		System.out.println("-------책  정  보-------");
		System.out.println("책 인덱스 : "+index);
		System.out.println("책 이름 : "+name);
		System.out.println("책 저자 : "+author);
		System.out.println("총 권수 : "+num);
		System.out.println("대출중인 책 권수 : "+occupied_num);
		System.out.println("-------------------");
		System.out.println();
	}

	public boolean isOccupied() {
		System.out.println("("+occupied_num+"/"+num+") 권 대출 중");
		return isOccupied;
	}

	public boolean 책_대출가능성() {
		boolean b = false;
		intro();
		if (num> occupied_num) {
			occupied_num++;
			System.out.print("<대출 완료 => 현재 "+num+"권 중 "+occupied_num+"권 대출 중");
			b = true;
		}else {
			System.out.print("<대출 불가능 - "+num+"권 중 "+occupied_num+"권 대출 중");
			b = false;
		}
		System.out.println(">");
		
		return b;
	}
	
	public boolean 책_반납가능성() {
		boolean b = false;
		intro();
		if (occupied_num>0) {
			occupied_num--;
			System.out.print("<반납 완료 => 현재"+num+"권 중 "+occupied_num+"권 대출 중");
			b = true;
		}else {
			System.out.print("<반납 불가능 - 대출중인 책이 없습니다.");
			b = false;
		}
		System.out.println(">");
		
		return b;

	}
	
	
}
