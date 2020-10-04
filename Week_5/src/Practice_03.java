/* SuperEx */

class Point2{
	private int x, y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	} //��ǥ ����
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	} //��ǥ ���
}

//Point2�� ��ӹ޴� ColorPoint2 Ŭ����
class ColorPoint2 extends Point2{
	private String color;
	
	public ColorPoint2(int x, int y, String color) {
		super(x, y); //Point2 Ŭ������ ������ ȣ��
		this.color = color; //�� ����
	}
	
	public void showColorPoint() {
		System.out.print(color); //�� ���
		showPoint(); //��ǥ ���
	}
}

public class Practice_03 {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue"); //���� ��ǥ�� �� ����
		cp.showColorPoint(); //ColorPoint2 Ŭ������ showColorPoint �޼ҵ带 ����� ���� ���� ��ǥ ���
	}
}
