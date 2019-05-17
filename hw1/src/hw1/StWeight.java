package hw1;

public class StWeight {
	String name;
	double height, weight, st_wei;
	
	final double BASE = 110. , PERCENT = 0.9;
	final int GAP_5=5;
	
	StWeight(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	
	void checkStWeight() {
		st_wei = (height-BASE)*PERCENT;
	}
	void displayStWeight() {
		System.out.println("이름 : "+name);
		if (weight < (st_wei-GAP_5)) {
			System.out.println("*** 저체중 ***");
		}else if (weight > (st_wei+GAP_5)) {
			System.out.println("*** 과체중 ***");
		}else {
			System.out.println("*** 정상체중 ***");
		}
	}
}
