package Lesson513;



public class Sample {
	public static void main(String[] args) {

		String str = "apple";
		String[] array = {"a","p","p","l","e"};
		String result = "";

		for(String val: array) {
			result = result + val;
		}
		boolean a = str == result;
		boolean b = str.contentEquals(result);

		System.out.print(a + ":" +b);
	}
}
