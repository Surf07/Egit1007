package Lesson506;




class superClass{

	public void disp() {
		System.out.println("製品名は登録されていません");
	}
}
class subClassA extends superClass{

	@Override
	public void disp() {
		System.out.println("製品名はPRODUCTです。");
	}
}
class subClassB extends superClass{

	@Override
	public void disp() {
		System.out.println("製品名はMANUFACTUREです。");
	}
}
public class Sample {
      public static void main(String[] args) {

    	  superClass obj = new superClass();
    	  obj.disp();

    	  subClassA obj1 = new subClassA();
    	  obj1.disp();

    	  subClassB obj2 = new subClassB();
    	  obj2.disp();

    	  obj = new subClassB();
    	  obj.disp();

    	  superClass obj3[] = new superClass[3];
    	  obj3[0] = new superClass();
    	  obj3[1] = new subClassA();
    	  obj3[2] = new subClassB();

    	  for(int i = 0; i<3; i++) {
    		  obj3[i].disp();
    	  }
     }
}
