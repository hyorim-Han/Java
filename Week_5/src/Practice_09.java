/* MultipleInterfaceEx */

interface PhoneInterface2{
	final int TIMEOUT = 10000; //상수 필드
	void sendCall(); //추상 메소드
	void receiveCall(); //추상 메소드
	default void printLogo() {System.out.println("** Phone **");} //디폴트 메소드
}

interface MobilePhoneInterface extends PhoneInterface2{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) { return x + y; }
}

//PDA를 상속받고 MobilePhoneInterface와 MP3Interface에 선언된 추상 메소드를 모두 구현하는 SmartPhone 클래스
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	@Override
	public void sendCall() { System.out.println("따르릉따르릉~~"); }
	@Override
	public void receiveCall() { System.out.println("전화 왔어요."); }
	@Override
	public void sendSMS() { System.out.println("문자 갑니다."); }
	@Override
	public void receiveSMS() { System.out.println("문자 왔어요."); }
	//MobilePhoneInterface의 추상 메소드 구현
	
	@Override
	public void play() { System.out.println("음악 연주합니다."); }
	@Override
	public void stop() { System.out.println("음악 중단합니다"); }
	//MP3Interface의 추상 메소드 구현
	
	public void schedule() { System.out.println("일정 관리합니다."); }
	//추가 메소드
}

public class Practice_09 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone(); //SmartPhone 객체 생성
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}
}
