package Lesson572;//３つ目が分からん


class Point{
	int x;
	int y;

	Point( int x, int y){
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object p) {
		Point point = (Point)p;
		return(point.x ==this.x && point.y == this.y);
	}
}


public class CompareExample2 {
	public static void main(String[] args) {

		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		Point p3 = p2;

		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
	}
}
