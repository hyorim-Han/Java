import java.util.Scanner;

public class Operator_IfElse {

	public static void main(String[] args) {
		float a, b;
		String op;
		System.out.println("연산");
		Scanner scanner = new Scanner(System.in); //연산 입력
		a = scanner.nextFloat(); 
		op = scanner.next();
		b = scanner.nextFloat();
		
		if(op.equals("+")) { System.out.println(a + op + b + "의 연산 결과는 " + (a+b)); } //연산자가 +이면 더하기 연산 수행
		else if(op.equals("-")) { System.out.println(a + op + b + "의 연산 결과는 " + (a-b)); } //연산자가 -이면 빼기 연산 수행
		else if(op.equals("*")) { System.out.println(a + op + b + "의 연산 결과는 " + (a*b)); } //연산자가 *이면 곱하기 연산 수행
		else if(b == 0) { System.out.println("0으로 나눌 수 없습니다."); } //b가 0이면 오류 출력
		else { System.out.println(a + op + b + "의 연산 결과는 " + (a/b)); } //b가 0이 아니면 나누기 연산 수행
		
		scanner.close();

		}
}

