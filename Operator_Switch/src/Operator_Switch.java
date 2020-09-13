import java.util.Scanner;

public class Operator_Switch {

	public static void main(String[] args) {
		float a, b; //실수형 변수 2개
		String op;
		System.out.println("연산");
		Scanner scanner = new Scanner(System.in); //연산 입력
		a = scanner.nextFloat();
		op = scanner.next();
		b = scanner.nextFloat();
		
		switch(op) {
		case "+":
			System.out.println(a + op + b + "의 연산 결과는 " + (a+b));
			break; //연산자가 +이면 더하기 연산 후 벗어남
		case "-":
			System.out.println(a + op + b + "의 연산 결과는 " + (a-b));
			break; //연산자가 -이면 빼기 연산 후 벗어남
		case "*":
			System.out.println(a + op + b + "의 연산 결과는 " + (a*b));
			break; //연산자가 *이면 곱하기 연산 후 벗어남
		case "/":
			if(b==0) { System.out.println("0으로 나눌 수 없습니다."); break;} //연산자가 /이고 b가 0이면 오류 출력
			else {
				System.out.println(a + op + b + "의 연산 결과는 " + (a/b));
				break;//b가 0이 아니면 나눗셈 연산 수행 후 벗어남
			}
		}
		scanner.close();
	}

}
