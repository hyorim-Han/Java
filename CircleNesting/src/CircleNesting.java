
import java.util.Scanner;

public class CircleNesting {

	public static void main(String[] args) {
		int x1, y1, x2, y2, r1, r2;
		double distance;
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 원의 중심과 반지름 입력");
		x1 = scanner.nextInt(); //첫번쨰 원의 x좌표
		y1 = scanner.nextInt(); //첫번쨰 원의 y좌표
		r1 = scanner.nextInt(); //첫번쨰 원의 반지름
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("두번쨰 원의 중심과 반지름 입력");
		x2 = scanner1.nextInt(); //두번째 원의 x좌표
		y2 = scanner1.nextInt(); //두번쨰 원의 y좌표
		r2 = scanner1.nextInt(); //두번쨰 원의 반지름

		distance = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);

		if(distance>(r1 + r2)) {
			System.out.println("두 원은 서로 겹치지 않는다."); //중심 사이의 거리가 두 원의 반지름의 길이의 합보다 크면 겹치지 않는다.
		}
		else {
			System.out.println("두 원은 서로 겹친다."); //그렇지 않으면 겹친다.
		}
		scanner.close();
		scanner1.close();
	}

}