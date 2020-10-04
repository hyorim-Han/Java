/* InterfaceEx */

interface PhoneInterface{ 
	final int TIMEOUT = 10000; //상수 필드
	void sendCall(); //추상 메소드
	void receiveCall(); //추상 메소드
	default void printLogo() { System.out.println("** Phobe **"); }; //디폴트 메소드
}

class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() { System.out.println("띠리리리링"); } 
	//PhoneInterface의 sendCall 메소드 구현
	
	@Override
	public void receiveCall() { System.out.println("전화가 왔습니다.");	}
	//PhoneInterface의 receiveCall 메소드 구현
	
	public void flash() { System.out.println("전화기에 불이 켜졌습니다."); };
	//추가 메소드 구현
}

public class Practice_08 {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
