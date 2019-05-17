package java_test_preparation;

public class StWeight {

	String name;
	double height,weight,stW;
	StWeight(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	void checkStWeight() {
		 stW = (height - 110)*0.9;
	}
	
	void displayStWeight() {
		if (stW-5 > weight) {
			System.out.println("저체중");
		}else if (stW+5 < weight) {
			System.out.println("과체중");
		}else {
			System.out.println("정상체중");
		}
	}
}
