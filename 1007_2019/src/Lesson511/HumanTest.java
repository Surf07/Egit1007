package Lesson511;



class Human{

	String name;
	String birthday;
	int manpukudo;

	Human(String name, String birthday){
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = 100;
	}

	Human(){
		this.name = "We don't know";
		this.birthday = "We don't knowだっぺ";
		this.manpukudo = 50;
	}

	Human(String name, int manpuludo){
		this.name = "Kazu";
		this.manpukudo =1000;
	}

	void eat() {
		this.manpukudo +=60;
	}
}

public class HumanTest {
	public static void main(String[] args) {

		Human human = new Human("Kazu","July");
		Human human1 = new Human("Yuko","December");
		Human human2 = new Human("Haruka","March");
		Human human3 = new Human();
		Human human4 = new Human("Kazu",500);

		System.out.println("名前:" + human.name);
		System.out.println("生年月日:" + human.birthday);
		System.out.println("満腹度"+ human.manpukudo);

		System.out.println("名前:" + human1.name);
		System.out.println("生年月日:" + human1.birthday);
		System.out.println("満腹度"+ human1.manpukudo);

		System.out.println("名前:" + human2.name);
		System.out.println("生年月日:" + human2.birthday);
		System.out.println("満腹度"+ human2.manpukudo);

		System.out.println(human3.name);
		System.out.println(human3.birthday);
		System.out.println(human3.manpukudo);

		System.out.println(human4.name);
		System.out.println(human4.manpukudo);
	}
}
