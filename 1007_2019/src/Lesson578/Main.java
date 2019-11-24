package Lesson578;

import java.util.HashSet;
import java.util.Set;


	public class Main {
		public static void main(String[] args) {

			Set<Integer> set = new HashSet<Integer>();

			long start = System.nanoTime();

			for( int i = 0; i < 10000; i++)
			{
				set.add(i);
			}
			long end = System.nanoTime();
			System.out.println("result:" + (end - start) / 10000000f + "ms");
		}
	}






