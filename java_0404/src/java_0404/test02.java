package java_0404;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time(14,35,29);
		Time time2 = new Time(50729);
		Time time3 = new Time(true, 19, 54, 33);
		time.whatTime();
		time2.whatTime();
		time3.whatTime();
	}

}

class Time{
	boolean am;
	int hour;
	int minute;
	int second;
	
	
	Time(boolean am, int hour, int minute, int second){
		this(hour,minute,second); // 생성자 끼리 호출시
	}
     Time(int hour2, int minute2, int second2) {
		// TODO Auto-generated constructor stub
		//this.hour = hour;
		minute = minute2;
		second = second2;	
		am = hour2<=12? true:false;
		this.hour= am? hour2:(hour2-12);
	}
	
     Time(int second){
    	 hour = second/3600;
    	 second = second%3600; // hour 단위를 제거 하고 분 초 단위만 남는다.
    	 minute = second/60;
    	 this.second = second%60;
    	 
 		 am = hour<=12? true:false;
 		 hour= am? hour:(hour-12);
     }
     
     
	void whatTime() {

		System.out.println(am ? "오전":"오후");
		System.out.println(hour+"시 "+minute+"분 "+second+"초\n");
	}
	
}

class Human{
	int age;
	String name;
	
	void intro() {
		System.out.println("안녕, "+age+"살 "+name+"이라고 해." );
	}
}
