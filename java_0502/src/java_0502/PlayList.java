package java_0502;

public class PlayList {
	int totNum;
	int[] t_array = null;
	 PlayList(int totNum) {
		this.totNum = totNum;
	}
	
	void displayRnd() {
		t_array = new int[totNum];
		boolean flag = false;
		
		for (int i = 0; i < totNum; i++) {
			t_array[i] = 999;
		}
		
		
		for (int i = 0; i < totNum; i++) {
			do {
				int rNum = (int) ((Math.random()*(totNum*10))%totNum);
				flag=false;
				
				for (int j = 0; j <i; j++) {
					if (t_array[j] == rNum) {
						flag = true;
						break;
					}
				}
				
				if (flag) 
					;
				else {
					t_array[i]=rNum;
				}
			} while (flag);
			
		}
		
		for (int i : t_array) {
			System.out.println(i);
		}
	}
}
