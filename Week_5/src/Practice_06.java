/* Overriding */

class Weapon{
	protected int fire() {
		return 1;
	}
}

//Weapon을 상속받는 Cannon 클래스
class Cannon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}// 오버라이딩
}

public class Practice_06 {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " + weapon.fire());
	}

}
