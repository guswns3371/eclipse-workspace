package guswns2;

public class test05 {

	public static void main(String[] args) {

		double pie =0.;
		for (int end = 10; end <1000000000; end=end*10) {
			pie=0.;
		for (long deno = 1; deno <end; deno++) {
			pie = pie+(1.0/(deno*deno));
		}
		pie = Math.sqrt(pie*6);
		System.out.println("pie="+pie+" ("+end+")회");
		}
	}

}
