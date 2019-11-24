package Lesson507;


class Button{
	public void push() {
		System.out.println("電源スイッチが押されました。");
	}
}

class TV extends Button{

	@Override
	public void push() {
		System.out.println("テレビの電源がオンです。");
	}
	public void push(int a) {
		System.out.println(a + "チャンネルのボタンが押されました。");
		System.out.println(a + "チャンネルを表示します。");
	}
}

class DVD_Player extends Button{
	@Override
	public void push() {
		super.push();
		System.out.println("スタンバイしています。");
	}
	public void push(int a) {
		System.out.println( a + "ボタンが押されました。");
		System.out.println("チャプター" + a + "を再生します。");
	}
}

public class Sample12_2_2_1 {
	public static void main(String[] args) {

		TV tv = new TV();
		tv.push();
		tv.push(8);

		Button bt = tv;
		bt.push();
		tv.push(12);


		DVD_Player dvd = new DVD_Player();
		dvd.push();
		dvd.push(100);

	}
}
