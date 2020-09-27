import java.util.Scanner;
class manageSeat{ //좌석 관리 클래스
	private String seats[]; //좌석 배열
	
	public manageSeat() {
		seats = new String[10]; //한 줄에 열 개의 좌석 세팅
		
		for(int i = 0; i < 10; i++) {
			seats[i] = "---";
		} //좌석 초기화
	}
	
	public void showCurrentSeats() { //모든 줄의 현재 예약 현황 출력
		for(int i = 0;i < 10;i++) {
			System.out.print(seats[i] + " ");
		}
		System.out.println();
	}
	
	public boolean bookSeat(String name, int n) {
		if(seats[n-1].equals("---")) { //예약하고자 하는 자리가 비어있으면 예약
			seats[n - 1] = name;
			return true;
		}
		return false;
	}
	
	public boolean cancelSeat(String name) {
		for(int i = 0;i < 10;i++) { //해당 이름의 좌석 취소
			if(seats[i].equals(name)) {
				seats[i]="---";
				return true;
			}
		}
		return false;
	}
	
}

class bookingSystem{ //콘서트 에약 시스템
	Scanner scanner = new Scanner(System.in);
	private manageSeat s[]; //좌석
	private String grade[] = {"S", "A" ,"B"}; //좌석 등급
	
	public bookingSystem() {
		s = new manageSeat[3];
		for(int i = 0; i < 3; i++) {
			s[i] = new manageSeat();
		}
	}
	
	public void booking() { //예약
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int num = scanner.nextInt();
		System.out.print(grade[num-1] + ">>");
		s[num-1].showCurrentSeats();
		
		System.out.print("이름>>");
		String name = scanner.next();
		System.out.print("번호>>");
		int n = scanner.nextInt();
		
		boolean result = s[num-1].bookSeat(name, n); //예약 시도의 결과 받아옴.
		
		if(result == false) { //이미 예약된 좌석이라면 함수를 다시 불러와 재시도
			System.out.println("<<<이미 예약된 좌석입니다. 다시 시도해 주세요.>>>");
			this.booking();
		}
	}
	
	public void printAll() { //조회
		for(int i = 0; i < 3; i++) {
			System.out.print(grade[i] + ">>");
			s[i].showCurrentSeats();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void canceling() { //취소
		System.out.print("좌석 S:1, A:2, B:3>>");
		int num = scanner.nextInt();
		System.out.print(grade[num-1] + ">>");
		s[num-1].showCurrentSeats();
		
		System.out.print("이름>>");
		String name = scanner.next();
		
		boolean result = s[num-1].cancelSeat(name); //취소 시도의 결과 받아옴.
		
		if(result == false) { //일치하는 정보가 없으면 함수를 다시 불러와 재시도
			System.out.println("<<<일치하는 이름 정보가 없습니다. 다시 시도해 주세요.>>>");
			this.canceling();
		}
		else {System.out.println("<<<취소를 완료하였습니다.>>>");} //취소 완료 메세지 출력
	}
	
	public void running() { //시스템
		int op;
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			op = scanner.nextInt();
			
			switch(op) {
			case 1: //예약
				this.booking();
				break;
			case 2: //조회
				this.printAll();
				break;
			case 3: //취소
				this.canceling();
				break;
			case 4: //종료
				return;
			}
		}
	}
}

public class concertBooking {

	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		bookingSystem b = new bookingSystem();
		b.running();

	}

}
