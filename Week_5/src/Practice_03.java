/* SuperEx */

class Point2{
	private int x, y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	} //좌표 설정
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	} //좌표 출력
}

//Point2를 상속받는 ColorPoint2 클래스
class ColorPoint2 extends Point2{
	private String color;
	
	public ColorPoint2(int x, int y, String color) {
		super(x, y); //Point2 클래스의 생성자 호출
		this.color = color; //색 설정
	}
	
	public void showColorPoint() {
		System.out.print(color); //색 출력
		showPoint(); //좌표 출력
	}
}

public class Practice_03 {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue"); //점의 좌표와 색 설정
		cp.showColorPoint(); //ColorPoint2 클래스의 showColorPoint 메소드를 사용해 점의 색과 좌표 출력
	}
}
