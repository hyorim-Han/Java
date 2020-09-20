import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력>> ");
			try {
				int n = scanner.nextInt(); 
				int m = scanner.nextInt(); 
				//두 수 입력받음. 이 때 입력받은 것이 정수가 아니면 InputMismatchException 예외 발생.
				System.out.print(n + "x" + m + "=" + n*m);//예외가 없을 시 결과 출력
				break; //while문 벗어나기
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!"); //오류 출력
				scanner.nextLine();
			}
		}

	}

}
