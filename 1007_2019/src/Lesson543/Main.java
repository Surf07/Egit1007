package Lesson543;



class Main {
	 public static void main(String[] args) {
	 System.out.println("mainメソッドが始まりました");

	 // 10秒だけ待つだけのRunnable
	 Runnable r = new Runnable() {
	 public void run() {
	 System.out.println("スレッドの実行が始まりました");

	 try {
	 Thread.sleep(10000); // 10秒待つ
	 } catch (Exception e) {
	 }

	 System.out.println("スレッドの実行を終わります");
	 }
	 };

	 System.out.println("別スレッドを開始します");
	 new Thread(r).start();
	 System.out.println("mainメソッドが終わりました");
	 }
	}
