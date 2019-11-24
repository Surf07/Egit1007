package Lesson544;



class ConstructorSample6Parent {
	// スーパークラスのコンストラクタ
	 ConstructorSample6Parent() {
	 System.out.println("ConstructorSample6Parent");
	 }
	}


public class ConstructorSample6Child extends ConstructorSample6Parent {

	//サブクラスのコンストラクタでsuper()をしないと、スーパークラスのデフォルトコンストラクタあるいは
	//引数の無いコンストラクタを、自動的に呼び出します。これは「暗黙的なコンストラクタ呼び出し」とも呼ばれる。

	 ConstructorSample6Child() {
	 }

	//ですが、スーパークラスのコンストラクタがデフォルトコンストラクタか引数がないものだけ「ではない」なら、
	//そのコンストラクタを呼ばないとコンパイルエラー。


 public static void main(String[] args) {
   new ConstructorSample6Child();
}
}

