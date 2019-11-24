package Lesson523;



class ThisSampleClass{

	static String str;

	public void print(String str) {

		//this.str= str;
		//this.変数名だと警告が出る。static変数にアクセスする時は、"this.変数名""ではなく"クラス.変数名"でアクセス。
		//動作に問題ないが、thisを使うとstatic変数を誤まって変更してしまうバグの原因になりやすい。

		ThisSampleClass.str = str;
		//クラス名.変数名ならOK。
		System.out.println(ThisSampleClass.str);
	}
}

public class Main {
	public static void main(String[] args) {

		String str = "samurai";
		ThisSampleClass sc = new ThisSampleClass();
		sc.print(str);
	}
}
