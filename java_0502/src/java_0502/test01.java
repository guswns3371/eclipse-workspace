package java_0502;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,math,eng;
		int tot;
		double ave;
		
		do {
			kor = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("국어 성적을 입력하세요"));
		}while(kor<0 || kor>100);
		do {
			math = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("수학 성적을 입력하세요"));
		}while(math<0 || math>100);
		do {
			eng = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("영어 성적을 입력하세요"));
		}while(eng<0 || eng>100);
		
		
		tot = kor+math+eng;
		ave = tot/3.0;
		
		System.out.println("국어 :"+kor+" 수학 :"+math+" 영어 :"+eng);
		System.out.println("총점 :"+tot);
		System.out.println("평균 :"+ave);
		System.out.println("평균 :"+round(ave));
	}

	static double round(double d) {
		double res;
		res= ((int)(d+0.05)*10)/10.;
		return res;
	}
}
