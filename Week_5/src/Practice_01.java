/* ColorPointEx */

class Point{
	private int x, y; 
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	} //x, y��ǥ
	
	public void showPoint() {
		System.out.println("("+ x + "," + y + ")");
	} //��ǥ ���
}

//ColorPoint�� Point�� ��ӹ���
class ColorPoint extends Point{
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	} // �� ����
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	} // ���� ����� ��ǥ ���
}

public class Practice_01 {
	public static void main(String[] args) {
		Point p = new Point(); //Point ��ü ����
		p.set(1, 2); // Point Ŭ������ set �޼ҵ带 �̿��� x, y��ǥ ����
		p.showPoint(); //Point Ŭ������ showPoint �޼ҵ带 �̿��� ��ǥ ���
		
		ColorPoint cp = new ColorPoint(); // ColorPoint ��ü ����
		cp.set(3, 4); //Point Ŭ������ set �޼ҵ带 �̿��� x, y��ǥ ����
		cp.setColor("red"); //ColorPoint Ŭ������ setColor �޼ҵ带 �̿��� �� ���� ����
		cp.showColorPoint(); //ColorPoint Ŭ������ showColorPoint �޼ҵ带 �̿��� ���� ����� ��ġ ����
	}
}
