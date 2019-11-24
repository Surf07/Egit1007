package Lesson545;



//入り込み過ぎて、よう分からん

import java.util.function.Supplier;

class ThisSample4 implements ThisSample5Interface {

int field = 123;
final int finalField = this.field * 100; // ④フィールド初期化時の右辺値

// ③インスタンスイニシャライザ
{
System.out.println("Instance Initialzer: " + this);
}

// ②コンストラクタ
ThisSample4() {
System.out.println("Constructor(default): " + this);
}

// ①-1 インスタンスメソッド
void instanceMethod() {
System.out.println("Instance Method: " + this);

// 無名クラス
Supplier<Integer> s1 = new Supplier<Integer>() {
int anonymousClassField = 100;
public Integer get() {
System.out.println("Anonymous Class: " + this); // 無名クラスのインスタンス
System.out.println("Enclosing Instance: " + ThisSample4.this); // 無名クラスのエンクロージングインスタンス
return this.anonymousClassField;
}
};
s1.get();

// 内部クラス
Supplier<Integer> s2 = new ThisSampleInnerClass();
s2.get();

// ①-3 ラムダ式
Supplier<Integer> s3 = () -> {
System.out.println("Lambda: " + this);
return this.finalField;
};
s3.get();
}

// ⑤Receiver Paramter
void instanceMethod2(ThisSample4 this) {
System.out.println("Receiver Parameter: " + this);
}

// 内部クラス
class ThisSampleInnerClass implements Supplier<Integer> {
int innerClassField = 12345;

public Integer get() {
System.out.println("Inner Class: " + this); // 内部クラスのインスタンス
System.out.println("Enclosing Instance: " + ThisSample4.this); // 内部クラスのエンクロージングインスタンス
return this.innerClassField;
}
}

public static void main(String[] args) {
ThisSample4 sample = new ThisSample4();
System.out.println("Caller: " + sample.toString());
sample.instanceMethod();
sample.instanceMethod2();
sample.defaultMethod();
}
}

interface ThisSample5Interface {
// ①-2 デフォルトメソッド
default void defaultMethod() {
System.out.println("Default Method: " + this);
}
}

