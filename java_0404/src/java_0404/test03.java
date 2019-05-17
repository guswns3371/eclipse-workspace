package java_0404;

import java.time.LocalTime;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeNow time = new TimeNow();
		time.getTime();
		
	}

}
class TimeNow{
	boolean am;
	int hour,minute,second;
	
	{//초기화 블록이다 . 생성자 대신에 사용 할 수 있는데 생성자보단 별로다.
		
		LocalTime now = LocalTime.now();
		hour = now.getHour();
		am = hour>=12? false:true;
		hour = hour>=12? (hour-12):hour;
//		if (hour >=12) {
//			hour -=12;
//			am = false;
//		}else {
//			am = true;
//		}
		minute = now.getMinute();
		second = now.getSecond();
	}
	
	void getTime() {
		System.out.println(am? "오전":"오후");
		System.out.println(hour+"시 "+minute+"분 "+second+"초 ");
	}
}
