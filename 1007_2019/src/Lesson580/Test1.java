package Lesson580;


import java.util.HashSet;
import java.util.Set;


public class Test1 {
	public static void main(String[] args) {

		Set<String> color = new HashSet<>();

		color.add("青");
		color.add("赤");
		color.add("黄");
		color.add("黒");
		color.add("黄");

			System.out.println(color.size());
		}
	}

