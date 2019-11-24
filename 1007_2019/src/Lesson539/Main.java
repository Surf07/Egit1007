package Lesson539;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {

		//Dateを使う時は、java.util.Calendarとjava.text.SimpleDateFormatと組み合わせることが大変多いです。
		//【重要】DateをCalendarにする/CalendarをDateにする。

		// Date ➡️Calendar
		Date g = new Date();
		Calendar h = Calendar.getInstance();
		h.setTime(g);

		// Calendar➡️️Date
		Calendar i = Calendar.getInstance();
		Date j = i.getTime();


		//【重要】SimpleDateFormatで、Dateを文字列とし、解析をする。
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		String dateStr = df.format(d);
		System.out.println(dateStr);
		System.out.println(d);

		Date d2 = df.parse(dateStr);
		System.out.println(d2);


		//Dateから年月日・時刻・曜日などを抽出する。
	    //基準日時からの経過時間しか持っていないDateだけでは、年月日・時分秒・曜日の抽出をするのは難しいです。
		//もちろん、計算すればできないことはありませんが、結構な量の計算が必要。

		SimpleDateFormat df1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date d1 = df1.parse("2019/10/19 13:19:56.789");
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int ms = c.get(Calendar.MILLISECOND);
		int weekday = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(year); // → 2019
		System.out.println(month); // → 0 (Calendarでは月は0始まりのため、10月は9になる)
		System.out.println(day); //
		System.out.println(hour); //
		System.out.println(min); //
		System.out.println(sec); //
		System.out.println(ms); // → 789
		System.out.println(weekday);

	}
}