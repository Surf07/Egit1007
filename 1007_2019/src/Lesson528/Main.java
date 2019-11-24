package Lesson528;//i jのコードの関連生が、ようわからん。


//for(①初期化式；②条件式；④反復式){　③処理部　}
//for文は①初期化式→②条件式→③処理部→④反復式→②条件式→③処理部→④反復式→②条件式→③→④→②...


public class Main {
	public static void main(String[] args) {

		int num = 1;

		x:

		for(int i=0; i<3; i++) {

		for(int j=0; j<5; j++) {

	    	if(j==1) {
	    		continue;
	    	}
	    	if(j==3) {
	    		break x;
	    	}
	    	num +=i;
	    }
		}
		System.out.println(num);
	}

}
