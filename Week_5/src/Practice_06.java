/* Overriding */

class Weapon{
	protected int fire() {
		return 1;
	}
}

//Weapon�� ��ӹ޴� Cannon Ŭ����
class Cannon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}// �������̵�
}

public class Practice_06 {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� " + weapon.fire());
	}

}
