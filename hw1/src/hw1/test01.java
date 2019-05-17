package hw1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double height,weight, st_wei;
		final double BASE = 110. , PERCENT = 0.9;
		final int GAP_5=5;
		name = JOptionPane.showInputDialog("이름 입력");
		
		height = Double.parseDouble(JOptionPane.showInputDialog("키 입력"));
		weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게 입력"));
		
		st_wei = (height-BASE)*PERCENT;
		System.out.println("이름 : "+name);
		if (weight < st_wei-GAP_5) {
			System.out.println("*** 저체중 ***");
		}else if (weight > st_wei+GAP_5) {
			System.out.println("*** 과체중 ***");
		}else {
			System.out.println("*** 정상체중 ***");
		}
		
		
	}

}
