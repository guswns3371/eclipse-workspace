package java_0411;

public class Notebook {
	String CPU;
	int mem_size;
	int storage_size;

	Notebook(String CPU, int mem_size, int storage_size) {
		super();
		this.CPU = CPU;
		this.mem_size = mem_size;
		this.storage_size = storage_size;
	}

	void displayNotebook() {
		System.out.println("CPU : "+CPU);
		System.out.println("메모리 크기 : "+mem_size);
		System.out.println("하드 디스크 : "+storage_size);
	}
}
