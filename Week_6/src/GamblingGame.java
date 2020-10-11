import java.util.Scanner;

class gameResult{
	private int n1, n2, n3;
	public String name;
	public gameResult(String name) {
		this.name = name;
	}
	public boolean runGame() { 
		n1 = (int)((Math.random()*3)+1); //랜덤 함수를 통해 1,2,3 중 한 가지 숫자를 뽑는다
		n2 = (int)((Math.random()*3)+1);
		n3 = (int)((Math.random()*3)+1);
		System.out.print(n1 + " " + n2 + " " + n3 + " "); //뽑힌 숫자 출력
		if((n1 == n2) && (n2==n3)) {return true;} //세 숫자가 같으면 true 리턴
		else {return false;}
	}
}
public class GamblingGame {

	public static void main(String[] args) {
		int num;
		String name;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		num = s.nextInt();
		
		gameResult[] person = new gameResult[num]; //객체 생성
		for(int i = 0; i < num; i++) {
			System.out.print(i+1 + "번째 선수 이름>>");
			name = s.next();
			person[i] = new gameResult(name);
		}
		
		String buffer = s.nextLine();
		while(true) {
			for(int i = 0; i < num; i++) {
				System.out.print("[" + person[i].name + "]:<Enter>");
				buffer = s.nextLine();
				if(person[i].runGame()) { //gameResult 클래스의 runGame 함수의 반환값이 true이면 승리
					System.out.println(person[i].name + "님이 이겼습니다!");
					s.close();
					return;
				}
				System.out.println("아쉽군요!");
			}
		}
	}

}
