package guswns3;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pop="Yesterday all my troubles seemed so far away"+
				"Now it looks as though they're here to stay" +
				"Oh, I believe in yesterday" +
				"Suddenly I'm not half the man I used to be";
		
		System.out.println(pop);
		pop = pop.toLowerCase();
		System.out.println(pop);
		int[] alpha = new int[26];
		
		for (int i = 0; i < pop.length(); i++) {
			char c = pop.charAt(i);
			if (c>='a' && c<='z') {// 영문자가 아닌건 카운트시 걸러내기 위함이다.
				alpha[c-'a']++; // c 에서 a를 뺸다는건 a의 아스키코드로 변환해 c가 a라면 c-'a' =0 
			}
		}
		
		for (int i = 0; i < alpha.length; i++) {
			char c = (char)(i+'a');// i+'a' 도 만약 1+'a'라면 'b' 이다.
			System.out.println(c+":"+alpha[i]);
		}
	}

}
