package Lesson518;

//これ分からんわ


public class ConstructerSample5 {

	String name;

	 ConstructerSample5(){

		 this("sample1");
		 System.out.println("sample1");
	 }

	 ConstructerSample5(String str){

		 this(str,100);
		 System.out.println("sample2");
	 }

	 ConstructerSample5(String str, int i){
		 this.name = "sample3";
		 System.out.println("sample3,50");
	 }

	 public static void main(String[] args) {
		 ConstructerSample5 is = new ConstructerSample5();


		 new ConstructerSample5();
		 new ConstructerSample5("sample2");
		 new ConstructerSample5("sample3");
	 }
}