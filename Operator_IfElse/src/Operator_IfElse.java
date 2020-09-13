import java.util.Scanner;

public class Operator_IfElse {

	public static void main(String[] args) {
		float a, b;
		String op;
		System.out.println("연산");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		op = scanner.next();
		b = scanner.nextFloat();
		
		if(op=="+") {System.out.println(a + op + b + "의 연산 결과는 " + (a+b));}
		else if(op=="-") {System.out.println(a + op + b + "의 연산 결과는 " + (a-b));}
		else if(op=="*") {System.out.println(a + op + b + "의 연산 결과는 " + (a*b));}
		else if(b==0) { System.out.println("0으로 나눌 수 없습니다."); }
		else {System.out.println(a + op + b + "의 연산 결과는 " + (a/b));}
		
		scanner.close();

	}

}
