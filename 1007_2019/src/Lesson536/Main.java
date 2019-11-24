package Lesson536;//なんじゃ



class ConstructorSample{
	String str1 = "Samrai Engineer";

	public ConstructorSample() {
		System.out.println(str1);
	}

	public ConstructorSample(String str2) {
		System.out.println(str1 + " " + str2);
	}
}

public class Main {
	private static ConstructorSample cs;

	public static void main(String[] args) {
		setCs(new ConstructorSample("blog"));
	}

	public static ConstructorSample getCs() {
		return cs;
	}

	public static void setCs(ConstructorSample cs) {
		Main.cs = cs;
	}
}
