package java_0411;

public class Human {
	int age;
	String name;
	
	Notebook book; // 포함 : Has a
	
	 Human(String name, int age) {
		 this.age =age;
		 this.name = name;
	 }
	  Human() {
		  name = "김갑수";
		  age  =18;
	  }
	  
	 Human(String name, int age, String CPU, int mem_size, int storage_size){
		 this.name = name;
		 this.age = age;
		 book = new Notebook(CPU, mem_size, storage_size);
	 }
	 void intro() {
		 System.out.println(name+"의 나이는 "+age+"입니다.");
	 }

}
