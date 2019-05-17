package guswns2;

public class test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] data = {0x12,0x31,0x24,0x54,0x67,0x23,0x43,0x76,0x12,0x67}; //16진수 
		byte[] pwd = {0x0a,0x78,0x76,0x54,0x32,0x21,0x7c,0x6e,0x40,0x11};
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%02x  ",data[i]);
		}
		System.out.printf("\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%02x  ",pwd[i]);
		}
		
		System.out.printf("\n***************************************\n");
		for (int i = 0; i < 10; i++) {
			data[i]=(byte)(data[i]^pwd[i]);//^ OR연산자 : 동일한 입력이 들어오면 결과 =0 , 다른 입력이 들어오면 결과 =1
			System.out.printf("%02x  ",data[i]);
		
		}
		System.out.printf("\n---------------------------------------\n");
		for (int i = 0; i < 10; i++) {
			data[i]=(byte) (pwd[i]^data[i]); // 다시 ^연산 -> 복구됨
			System.out.printf("%02x  ",data[i]);
		}
	}

}
