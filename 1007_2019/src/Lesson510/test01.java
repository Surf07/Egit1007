package Lesson510;



class Piyota{
	
	
	String name;
	
	Piyota(){
		System.out.println("constructer");
		this.name="piyota";
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
}


public class test01 {
	public static void main(String[] args) {
		
		System.out.println("before new");
		
		Piyota p = new Piyota();
		
		System.out.println("after new");
		System.out.println(p.getName());
		System.out.println("Hello World");
	}
}
