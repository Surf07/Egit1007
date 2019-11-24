package Lesson575;


import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {

		Set<Integer> hash_set = new HashSet<Integer>();

		hash_set.add(1);
		hash_set.add(2);
		hash_set.add(3);
		hash_set.add(1);
		hash_set.add(11);
		hash_set.add(3);

		for(Integer value : hash_set)
		{
			System.out.println(value);
		}
	}

}
