package Lesson540;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[a-z]");
		Matcher matcher = pattern.matcher("あいうえお abcdefg");
		
		if(matcher.find()) {
			System.out.println("マッチする部分があります");
		} else {
			System.out.println("マッチする部分がありません");
		}
	}
}
	