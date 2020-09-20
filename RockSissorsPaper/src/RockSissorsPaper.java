import java.util.Scanner;

public class RockSissorsPaper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String user, comp;
		String computer[] = {"가위", "바위", "보"}; //컴퓨터가 내는 경우의 수의 배열
		String win = ", 사용자가 졌습니다", draw = ", 비겼습니다", lose = ", 사용자가 졌습니다."; // 결과들의 배열

		while(true) {
			String result = null;
			System.out.print("가위 바위 보!>>");
			user = scanner.next(); //가위 바위 보 입력
			if(user.equals("그만")) {System.out.println("게임을 종료합니다..."); break;} // 그만이면 종료

			int n = (int)(Math.random()*3); //0,1,2 중 랜덤하게 수 선택
			comp = computer[n]; //컴퓨터가 내는 수 결정
			
			if(user.equals(computer[n])) {result = draw;} //사용자와 컴퓨터의 수가 같으면 비긴다
			else if(user.equals("가위")) { //사용자가 가위일때
				if(n == 1) {result = lose;} //컴퓨터가 바위면 사용자가 진다.
				else {result = win;} //컴퓨터가 보이면 사용자가 이긴다.
			}
			else if(user.equals("바위")) { //사용자가 바위일때
				if(n == 2) {result = lose;} //컴퓨터가 보이면 사용자가 진다.
				else {result = win;} //컴퓨터가 가위이면 사용자가 이긴다.
			}
			else if(user.equals("보")){ //사용자가 보일때
				if(n == 0) {result = lose;} //컴퓨터가 가위이면 사용자가 진다.
				else {result = win;} //컴퓨터가 바위이면 사용자가 이긴다.
			}
			System.out.println("사용자 = " + user + ", 컴퓨터 = " + comp + result); //결과 출력
		}
		scanner.close();
	}
}