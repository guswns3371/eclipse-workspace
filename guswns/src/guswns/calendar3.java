package guswns;
import java.util.*;
public class calendar3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    // Prompt user to enter year 
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Prompt user to enter first day of the year
   // System.out.println("Enter the weekday that the year starts: ");
//    int day = input.nextInt();
    int day = 0;
    
    System.out.println("Enter a month : ");
    int MM = input.nextInt();
    String monthhh = MM+"";
    
    
    int dayCounter = day;
     int nbrOfDays = 0;
     String  monthx = ""; 
    for (int month= 1; month <=12; month++)
    {

                        // Switch to chose the month 
              switch (month)
             {
                  case 1: monthx = "1";
                             nbrOfDays = 31;
                             break;
                  case 2: monthx = "2";
                                     if ( (year-1996) % 4 == 0 && (year-1996) % 100 !=0 || (year-1996) % 400 == 0)
                      {
                             nbrOfDays = 29;
                             break;
                      }
                                     else
                         {  nbrOfDays = 28;
                             break;
                         }
                 case 3: monthx = "3";
                             nbrOfDays = 31;
                             break; 
                  case 4: monthx = "4";
                             nbrOfDays = 30;
                             break; 
                         case 5: monthx = "5";
                             nbrOfDays = 31;
                             break;

                         case 6: monthx = "6";
                             nbrOfDays = 30;
                             break;
                          case 7: monthx = "7";
                             nbrOfDays = 31;
                             break;
                          case 8: monthx = "8";
                             nbrOfDays = 31;
                             break;
                    case 9: monthx = "9";
                             nbrOfDays = 30;
                             break; 
                    case 10: monthx = "10";
                             nbrOfDays = 31;
                             break; 
                    case 11: monthx = "11";
                             nbrOfDays = 30;
                             break; 
                         case 12: monthx = "12";
                             nbrOfDays = 31;
                             break;                  
             }

              if(monthx.equals(monthhh)) {
                 System.out.printf("%15s %d  \n", monthx , year);
                 System.out.println("----------------------------");
                 System.out.printf("%s %s %s %s %s %s %s\n ", "월","화","수", "목", "금","토","일");
              }

                 for (int space =1; space<=day; space++) 
                 {
                	 if(monthx.equals(monthhh)) 
                     System.out.printf("%4s", "    ");
                 }
                 for (int i = 1; i <=nbrOfDays; i++)
                 {
                    dayCounter++;
                    if ( dayCounter% 7==0)
                    { if(monthx.equals(monthhh)) 
                    	System.out.printf("%- 4d\n", i);
                    }
                     
                    else { if(monthx.equals(monthhh)) 
                    	System.out.printf("%-4d", i);
                    }
                    

                 }
                 day = (day + nbrOfDays)%7;
                 if(monthx.equals(monthhh)) 
                         System.out.println();  
              


    }    

}
}