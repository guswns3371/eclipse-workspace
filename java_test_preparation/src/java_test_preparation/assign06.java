package java_test_preparation;

import java.util.Random;

public class assign06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] song_list = new String[10];
		for (int i = 0; i < song_list.length; i++) {
			song_list[i] = "song_"+(i+1);
		}
		
		random_song(song_list);
	}
	
	static void random_song(String[] song_list) {
		int rnum_list[] = new int[10];
		Random r = new Random();
		for (int i = 0; i < song_list.length; i++) {
			
			
			rnum_list[i] = r.nextInt(10);// 0 부터 파라미터-1 값까지 가져올 수 있다
			
			for (int j = 0; j < i; j++) {// i 전의 나왔던 숫자들이랑 비교해서 만약 같으면
				if (rnum_list[i] == rnum_list[j]) {
					i--;//다시 뒤로 뺵하고 다시 랜덤수 발생
				}
			}
		}
		
		for (int i = 0; i < song_list.length; i++) {
			System.out.println(song_list[rnum_list[i]]);
		}
		int a=0;
		for (int i : rnum_list) {
			a +=i;
		}
		System.out.println(a);
		
	}

}
