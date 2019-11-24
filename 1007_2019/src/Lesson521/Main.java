package Lesson521;




class ThisSampleClass {

	private String str = "engineer";


	public void print(String str) {
		System.out.println("str =" + str);
		System.out.println("this.str =" + this.str);
		// fieldを指定したい場合にはthisを経由する。
	}
}

    public class Main{
    	public static void main(String[] args) {

    		String str = "samurai";

    		ThisSampleClass sc = new ThisSampleClass();

    		sc.print(str);
    	}
    }