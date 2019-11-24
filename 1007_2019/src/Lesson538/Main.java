package Lesson538;



import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);


		Date e = new Date(1000 * 60 * 60 * 24);
		System.out.println(e);


		Calendar c = Calendar.getInstance();
		Date f = c.getTime();
		System.out.println(c);
		System.out.println(f);


		Date d1 = new Date();
		System.out.println(d1 + ": 処理XXXXが始まりました");
		for(long i = 0; i < 10000000000L; i++) {
			;
		}
		Date d2 = new Date();
		System.out.println(d2 + ": 処理XXXXが終わりました");


		Date start = new Date();
		for(long i = 0; i < 10000000000L; i++) {
			;
		}
		Date end = new Date();
		long diff = end.getTime() - start.getTime();
		System.out.println("処理時間は " + diff + "ms です");
		//ミリ秒（millisecond、記号: ms）は、1000分の1秒(10−3 s, 1/1,000 s)に等しい時間の単位。

		}
}
