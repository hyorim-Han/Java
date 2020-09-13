import java.util.Scanner;

public class Operator_Switch {

	public static void main(String[] args) {
		float a, b;
		String op;
		System.out.println("연산");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		op = scanner.next();
		b = scanner.nextFloat();
		
		switch(op) {
		case "+":
			System.out.println(a + " + " + b + "의 연산 결과는 " + (a+b));
			break;
		case "-":
			System.out.println(a + " - " + b + "의 연산 결과는 " + (a-b));
			break;
		case "*":
			System.out.println(a + " * " + b + "의 연산 결과는 " + (a*b));
			break;
		case "/":
			if(b==0) { System.out.println("0으로 나눌 수 없습니다."); }
			else {
				System.out.println(a + " / " + b + "의 연산 결과는 " + (a/b));
				break;
			}
		}
		
		scanner.close();

	}

}
