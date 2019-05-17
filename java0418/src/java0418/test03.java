package java0418;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human[] teammem = {
			new Human("채치수", 19),
			new Human("강백호", 19),
			new Student("정대민",19,"컴퓨터공학"),
			new Student("서태웅",17,"체육"),
			new GraduatedStudent("송태섭", 19, "체육", "농구")
		};
		
		
		for(Human h : teammem) {
//			System.out.println(h.name);
			h.intro();
			
			if (h instanceof Student) {
				Student new_name = (Student) h;
				new_name.study();
			}
			
			if (h instanceof GraduatedStudent) {
				GraduatedStudent new_name = (GraduatedStudent) h;
				new_name.research();
			}
			System.out.println();
		}
		
	}

}
