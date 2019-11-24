package Lesson531;




class Main {
	public static void main(String[] args) {

		int num;

		System.out.println("後値の場合");
		num = 10;
		System.out.println(num);
		System.out.println(num++); // (num = num) + 1
		System.out.println(num);

		System.out.println("前値の場合");
		num = 10;
		System.out.println(num);
		System.out.println(++num); // num = (num + 1)
		System.out.println(num);
	}
}
