package Lesson576;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(43);
		list.add(5);
		list.add(3);

		Set<Integer> set = new HashSet<Integer>(list);

		for(Integer value : set)
		{
			System.out.println(value);
		}
	}
}
