import java.util.Scanner;

import javax.swing.JOptionPane;

public class 도형 {

	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		n = Integer.parseInt(JOptionPane.showInputDialog("n 값을 입력하세요 "));
		int which = Integer.parseInt(JOptionPane.showInputDialog("1. 마름모\n2. 원\n3. 별 "));
		
		switch (which) {
		case 1:
			마름모();
			break;
		case 2:
			원();
//			a();
			break;
		case 3:
			별();
			break;
		default:
			마름모();
			System.out.println();
			원();
			System.out.println();
			break;
		}
		
		
		
	}
	static void 마름모() {
				
		for (int x = 0; x < 2*n; x++) {
			for (int y = 0; y < 2*n; y++) {
				if ( (y<(x+n)) && (y<(-x+3*n)) && (y>(x-n)) && (y>(-x+n)) ) {
					System.out.printf("%1s","**");
				}else {
					System.out.printf("%2s"," ");
				}
			}
			System.out.println();
		}
	}
	
	static void 원() {
		
		for (int x = 0; x < 2*n; x++) {
			for (int y = 0; y < 2*n; y++) {
				if ( ( Math.pow((x-n),2)+Math.pow((y-n),2) )< Math.pow((n),2) ) {
					System.out.printf("%1s","**");
				}else {
					System.out.printf("%1s","  ");
				}
			}
			System.out.println();
		}
	}
	
	static void 별() {
		for (int x = 0; x < 3*n; x++) {
			for (int y = 0; y < 3*n; y++) {
				if ( (2*y>3*(x-n)) && (2*y<(-3)*(x-3*n)) && (x>n) && (2*y>-x+3*n) && (2*y<x+3*n) ) {
					System.out.printf("%2s","*");
				}else if((2*y<3*(x-n)) && (2*y<(-3)*(x-3*n)) && (2*y>-x+3*n)) {
					System.out.printf("%2s","*");
				}else if( (x>n) && (2*y<x+3*n) && (2*y<-x+3*n)) {
					System.out.printf("%2s","*");
				}else if( (2*y>-x+3*n) && (2*y<x+3*n) && (x<n)) {
					System.out.printf("%2s","*");
				}else if( (2*y<(-3)*(x-3*n)) && (x>n) && (2*y>x+3*n) ) {
					System.out.printf("%2s","*");
				}else if((2*y>3*(x-n)) && (2*y<x+3*n) && (2*y>(-3)*(x-3*n))) {
					System.out.printf("%2s","*");
				}else {
					System.out.printf("%2s"," ");
				}
			}
			System.out.println();
		}
	}
	
	static void a() {
		int r = n;
		
		for(int x=0; x<r; x++)
		{
			
		if(x>=0 || x<=r)
		{
			for(int y =0; y<r;y++)
			{
				if(y>=0 || y<=r)
				{
					
					if(Math.pow(x-r, 2)+Math.pow(y-r, 2)<=Math.pow(r, 2))
						System.out.print("**"); //원 안쪽
					
					if(Math.pow(x-r, 2)+Math.pow(y-r, 2)>Math.pow(r, 2))
						System.out.print("  ");
				}
				
				
			}
			for(int y =r; y<=2*r;y++)
			{
				
				if(y>r || y<=2*r)
				{
				
				if(Math.pow(x-r, 2)+Math.pow(y-r, 2)>Math.pow(r, 2))
				{
					System.out.print("  ");
				}
				if(Math.pow(x-r, 2)+Math.pow(y-r, 2)<=Math.pow(r, 2))
				{
					System.out.print("**"); //원 안쪽
				}
				}
			}
				
			System.out.println();
			
			
		}
		}
		for(int x=r; x<=2*r; x++)
		{
		
		if(x>r || x<=2*r)
		{
		
			for(int y =0; y<r;y++)
			{
				if(y>=0 || y<=r)
				{
					if(Math.pow(x-r, 2)+Math.pow(y-r, 2)<=Math.pow(r, 2))
						System.out.print("**");	//원 안쪽
					 
					if(Math.pow(x-r, 2)+Math.pow(y-r, 2)>Math.pow(r, 2))
						System.out.print("  ");
					
				}
				
			}
			for(int y =r; y<=2*r;y++)
			{
				if(y>r || y<=2*r)
				{
					if(Math.pow(x-r, 2)+Math.pow(y-r, 2)>Math.pow(r, 2))
						System.out.print("  ");	
					
					if(Math.pow(x-r, 2)+Math.pow(y-r, 2)<=Math.pow(r, 2))
						System.out.print("**"); //원 안쪽
				}
				
			}
			System.out.println();
			
			}
		}// 아랫부분 (가운데 제외)
	}

}
