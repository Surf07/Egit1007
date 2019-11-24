package Lesson522;



class ThisSampleClass{

	private String str1;
	private String str2;

	ThisSampleClass(String str){
		this("samurai", str);
	}

	ThisSampleClass(String str1, String str2){
		this.str1 = str1;
		this.str2 = str2;
	}

	public void print() {
		System.out.println(str1);
		System.out.println(str2);
	}
}

public class Main {
	public static void main(String[] args) {

		String str = "engineer";

		ThisSampleClass sc = new ThisSampleClass(str);

		sc.print();
	}
}


