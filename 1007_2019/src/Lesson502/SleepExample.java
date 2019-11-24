package Lesson502;


public class SleepExample {
	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.print(e);
			}

			System.out.print("*");
		}
	}
}
