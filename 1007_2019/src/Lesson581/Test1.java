package Lesson581;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {

		Set<String> a1 = new HashSet<>();

		a1.add("a");
		a1.add("b");

		Set<String> b1 = new HashSet<>();

		b1.add("あ");
		b1.add("い");

		a1.addAll(b1);

		for(String a : a1) {
			System.out.print(a);
		}
	}
}
