package guswns;
import java.util.Scanner;
public class calendar2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int Y = 1996;    // year
        int startDayOfMonth = 0;
        int spaces = startDayOfMonth ;

        System.out.println("년도 입력 :");
        int inputY = input.nextInt();
        int gapY = inputY - Y;
        System.out.println(gapY);
        // months[i] = name of month i




           
                String[] months = {
                        "",                               // leave empty so that we start with months[1] = "January"
                        "1월", "2월", "3월",
                        "4월", "5월", "6월",
                        "7월", "8월", "9월",
                        "10월", "11월", "12월"
                    };
                // days[i] = number of days in month i
                int[] days = {
                    0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
                };
                for (int M = 1; M <= 12*(gapY+1); M++) {

                	int a = M%12;
                	if (a==0) {
						a=12;
					}
                    // check for leap year
                    if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && a == 2) {
                    	days[a] = 29;
                    }
                        


                    // print calendar header
                    // Display the month and year
                    System.out.println("          "+ months[a] + " " + Y);

                    // Display the lines
                    System.out.println("_____________________________________");
                    System.out.println("   Mon Tue  Wed  Thu   Fri  Sat  Sun");

                    // spaces required
                       spaces = (days[a-1] + spaces)%7;
                       System.out.println(spaces+" / "+days[a-1]+"\n");
                    // print the calendar
                    for (int i = 0; i < spaces; i++)
                        System.out.print("     ");
                    for (int i = 1; i <= days[a]; i++) {
                        System.out.printf(" %3d ", i);
                        if (((i + spaces) % 7 == 0) || (i == days[a])) {
                        	System.out.println();
                        	System.out.print(i + spaces);
                        }
                    }

                    System.out.println();
                    
                    if(a==12) {
                    	Y++;
                    }
                }
            	
                
			

            
            
    }
}