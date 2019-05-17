package java_test_preparation;

import javax.swing.JOptionPane;

public class assign01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("이믈을 입력하세요");
		double height = Double.parseDouble(JOptionPane.showInputDialog("키을 입력하세요"));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게을 입력하세요"));
		
		standardWeight(height, weight, name);
	}

	static void standardWeight(double height, double weight, String name) {
		double standard = (height-110)*(0.9d);
		System.out.println(name+"님의 키는 "+height+"이고 몸무게는 "+weight+"입니다.");
		System.out.println("표준몸무게는 "+standard+"이고\n"+name+"님은");
		if (standard-5 > weight) {
			System.out.print("저체중입니다.");
		}else if (standard+5 < weight) {
			System.out.print("과체중입니다.");
		}else {
			System.out.print("정상체중입니다.");
		}
		
	}
}
