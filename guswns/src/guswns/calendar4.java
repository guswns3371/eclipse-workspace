package guswns;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class calendar4 {
	public static void main(String[] args) throws NumberFormatException, IOException {

	  // 년와 월을 입력 받아 달력을 출력
	  BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	  
	  System.out.print("년을 입력해주세요 : ");
	  int year = Integer.parseInt(read.readLine());
	  
	  System.out.print("월을 입력해주세요 : ");
	  int month = Integer.parseInt(read.readLine());
	  
	  // 해당 월의 1일까지의 일자의 갯수

	  int[] maxDate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  
	  if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
	   maxDate[1]=29; // 윤년일 경우
	  }
	  
	  // 작년
//	  int lastYear = year-1;
	  int lastYear = 1996;
	  // 작년까지 발생한 윤년의 횟수
	  int leapYear_cnt = (lastYear/4) - (lastYear/100) + (lastYear/400);
	  // 해당년의 해당월의 1일까지의 일자 수 구하기
	  int dayOfYear = 5;
	  

	  
	  for(int i=0; i<month-1; i++) {
	   dayOfYear += maxDate[i];
	  }  
	    // 해당 월의 첫번째 날짜의 요일
	    int dayOfweek = (lastYear + leapYear_cnt + dayOfYear)%7;
	    

	    System.out.printf("%d년 %02d월\n", year, month);
//	    System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
	    System.out.printf("월\t화\t수\t목\t금\t토\t일\n");
	    
	    // 공백 출력
	    for(int i =0; i<dayOfweek; i++) {
	     System.out.print("\t");
	    }
	     // 월에 따른 날짜 출력 조건
	    int lastDay = maxDate[month-1];
	    
	    // 날짜 출력
	    for(int i = 1; i<=lastDay; i++) {
	     System.out.print(i + "\t");
	     if((dayOfweek+i)%7 ==0) {
	      System.out.println();
	     }
	    }

	    
}
}




