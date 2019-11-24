package Lesson559;


import java.util.HashMap;


public class MapExample {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();

		map.put("first name", "Kazuya");
		map.put("Last name", "Iida");
		map.put("address", "Tokyo 9999-999");
		map.put("tel", "03-***-**");

		System.out.println(map.entrySet());

		System.out.println(map.keySet());

		System.out.println(map.get("first name"));

		System.out.println(map.get("Last name"));

		System.out.println(map.get("address"));

		System.out.println(map.get("tel"));

		System.out.println(map.get("e-mail"));

	}
}
