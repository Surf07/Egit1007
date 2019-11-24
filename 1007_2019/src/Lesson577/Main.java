package Lesson577;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		long start = System.nanoTime();

		for( int i = 0; i < 10000; i++)
		{
			list.add(i);
		}
		long end = System.nanoTime();
		System.out.println("result:" + (end - start) / 10000000f + "ms");
	}
}
