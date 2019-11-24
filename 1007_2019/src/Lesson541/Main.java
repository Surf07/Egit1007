package Lesson541;


import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {
	public static void main(String[] args)  {

		Pattern pattern = Pattern.compile("[a-z]+"); // アルファベットの小文字の連続にマッチするPattern
		Matcher matcher1 = pattern.matcher("あいうえお abcdefg");

		//lookingAtは文字列の先頭からマッチングします。ですので文字列が「このパターンから始まる」かどうかが分かります。
		if (matcher1.lookingAt()) {
		 System.out.println("lookingAtでマッチしました");
		} else {
		 System.out.println("lookingAtでマッチしませんでした"); // → こちら
		}

		Matcher matcher2 = pattern.matcher("abcdefg あいうえお");

		if (matcher2.lookingAt()) {
		 System.out.println("lookingAtでマッチしました"); // → こちら
		} else {
		 System.out.println("lookingAtでマッチしませんでした");
		}
	}
}