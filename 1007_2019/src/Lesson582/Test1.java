package Lesson582;//よう分からん


import java.util.HashSet;
import java.util.Set;


public class Test1 {
	public static void main(String[] args) {

		Set<String> color = new HashSet<>();
		color.add("赤");
		color.add("黄");
		color.add("青");

		color.forEach(a -> System.out.print(a));
		color.forEach(System.out::print);

		color.forEach(System.out::println);
	}

}
