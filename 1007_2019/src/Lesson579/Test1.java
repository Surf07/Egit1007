package Lesson579;


import java.util.HashSet;
import java.util.Set;


public class Test1 {
	public static void main(String[] args) {

		Set<String> color = new HashSet<>();

		color.add("青");
		color.add("赤");
		color.add("黄");

		for(String a : color) {
			System.out.println(a);
		}
	}
}
