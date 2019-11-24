package Lesson509;


import java.awt.Desktop;
import java.net.URI;


public class OpenURLExample {
	public static void main(String[] args) {

		Desktop desktop = Desktop.getDesktop();

		String website = "https://www.google.co.jp/";
		try {
			desktop.browse(new URI(website));
		} catch(Exception e) {
			e.printStackTrace();
		}

		String[] urls = {"https://www.google.co.jp/" , "https://www.yahoo.co.jp/"};
		try {
			for(String url : urls) {
				desktop.browse(new URI(url));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
