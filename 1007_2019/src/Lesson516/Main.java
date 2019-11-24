package Lesson516;




class Hero{


	int hp;
	String name;

	Hero(String name, int hp){
		this.hp=100;
		this.name = name;

	}

	Hero(){
		this("Kazu",50);
		System.out.println("どや？");
		System.out.println("確認せい");
	}
}

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();

		System.out.println(h.hp);
		System.out.println(h.name);
	}

}
