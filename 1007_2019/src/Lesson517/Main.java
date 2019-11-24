package Lesson517;



public class Main {

	Main(){
		System.out.println("Kazuya Iida");
	}

	public static void main(String[] args) {
		System.out.println("コンストラクタ呼び出し前");

		new Main();

		System.out.println("コンストラクタ呼び出し後");
		System.out.println("コンストラクタ呼び出しが一番早いんだ");
	}
}
