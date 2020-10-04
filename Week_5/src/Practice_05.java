/* MethodOverridingEx */

class Shape{
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}
//Shape 쿨래스를 상속받은 Line 클래스
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	} //메소드 오버라이딩
}
//Shape 클래스를 상속받은 Rect 클래스
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	} //메소드 오버라이딩
}
//Shape 클래스를 상속받은 Circle
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	} //메소드 오버라이딩
}
public class Practice_05 {
	static void paint(Shape p) {
		p.draw(); //오버라이딩된 함수. 동적 바인딩
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape()); 
		paint(new Line()); 
		paint(new Rect());
		paint(new Circle());
	}
}
