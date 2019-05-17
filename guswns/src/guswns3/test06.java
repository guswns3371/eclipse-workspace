package guswns3;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] song = {"보헤미안 랩소디","당신과는 천천히","여행을 떠나요","야간비행"
				,"사랑을 했다","킬리만자로의 표범"};
		
	
		for (int i = 0; i < 10; i++) {
			int p = (int)((Math.random()*100)%(song.length));
			System.out.println(song[p]);
		}

		
		
//		for (int i = 0; i < song.length; i++) {
//			System.out.println(song[i]);
//		}
		
//		for(String s : song) {
//			System.out.println(s);
//		}
	}

}
