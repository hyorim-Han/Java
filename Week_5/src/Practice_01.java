/* ColorPointEx */

class Point{
	private int x, y; 
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	} //x, y좌표
	
	public void showPoint() {
		System.out.println("("+ x + "," + y + ")");
	} //좌표 출력
}

//ColorPoint가 Point를 상속받음
class ColorPoint extends Point{
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	} // 점 색깔
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	} // 점의 색깔과 좌표 출력
}

public class Practice_01 {
	public static void main(String[] args) {
		Point p = new Point(); //Point 객체 생성
		p.set(1, 2); // Point 클래스의 set 메소드를 이용해 x, y좌표 설정
		p.showPoint(); //Point 클래스의 showPoint 메소드를 이용해 좌표 출력
		
		ColorPoint cp = new ColorPoint(); // ColorPoint 객체 생성
		cp.set(3, 4); //Point 클래스의 set 메소드를 이용해 x, y좌표 설정
		cp.setColor("red"); //ColorPoint 클래스의 setColor 메소드를 이용해 점 색깔 설정
		cp.showColorPoint(); //ColorPoint 클래스의 showColorPoint 메소드를 이용해 점의 색깔과 위치 설정
	}
}
