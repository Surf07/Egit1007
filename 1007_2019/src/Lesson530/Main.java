package Lesson530;     //よう分からん


public class Main {


	int i = 0;
	static int num = 0;
	public void test() {
		while( i<3 ) {

			i++;
			num++;
			//たぶん、
			// i = i + 1        　i=1,2,3
			// num = num + 1    num=1,2,3

			System.out.println((num) + "回目の処理です");
		}
	}
	public static void main(String[] args) {
		Main a = new Main();
		Main b = new Main();
		a.test();
		b.test();

		System.out.println(num + "終了しました" + Main.num);
	}
}
