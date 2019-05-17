package guswns2;

public class test06 {

	public static void main(String[] args) {
		
		//int i_num = 0x12345678;
		int i_num = 0x89abcdef;

		int t_num;
		
		
		//System.out.printf("%d\n",i_num); //printf 으로 
		
		System.out.printf("0x%x\n",i_num);
		
		t_num = i_num>>16;//4칸 오른쪽으로 쉬프트 , >> 연산자는 부호비트로 공백을 채워준다
		System.out.printf("0x%08x\n",t_num); // 0x%08x : 16진 상수를 8자리로 출력하라
		
		t_num = i_num<<16;//4칸 인쪽으로 쉬프트
		System.out.printf("0x%08x\n",t_num); 
		
		t_num=i_num>>>16; // >>>연산자는 부호비트가 아닌 0으로 공백을 채워준다
		System.out.printf("0x%08x\n",t_num); 
	}

}
