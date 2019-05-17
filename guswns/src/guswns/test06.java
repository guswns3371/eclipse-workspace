package guswns;

import javax.swing.JOptionPane;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country;
		String city = "";
		country = JOptionPane.showInputDialog("나라 이름 입력");
		boolean flag = true;
		switch (country) {
		case "한국":
			city = "서울";
			break;

		case "중국":
			city = "베이징";
			break;
			
		case "미국":
			city = "워싱턴";
			break;
			
		case "핀란드":
			city = "헬싱키";
			break;
			
		case "아이슬란드":
			city = "레이캬비크";
			break;
		default:
			flag = false;
			break;
		}
		if (flag) {
			System.out.println("수도 이름 : "+city);
		}else {
			System.out.println("지원 하지 않는 나라입니다");
		}
	}

}
