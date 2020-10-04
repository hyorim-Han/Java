/* MethodOverridingEx */

class Shape{
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}
//Shape �𷡽��� ��ӹ��� Line Ŭ����
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	} //�޼ҵ� �������̵�
}
//Shape Ŭ������ ��ӹ��� Rect Ŭ����
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	} //�޼ҵ� �������̵�
}
//Shape Ŭ������ ��ӹ��� Circle
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	} //�޼ҵ� �������̵�
}
public class Practice_05 {
	static void paint(Shape p) {
		p.draw(); //�������̵��� �Լ�. ���� ���ε�
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
