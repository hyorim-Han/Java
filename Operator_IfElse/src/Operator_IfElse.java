import java.util.Scanner;

public class Operator_IfElse {

	public static void main(String[] args) {
		float a, b;
		String op;
		System.out.println("����");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		op = scanner.next();
		b = scanner.nextFloat();
		
		if(op=="+") {System.out.println(a + op + b + "�� ���� ����� " + (a+b));}
		else if(op=="-") {System.out.println(a + op + b + "�� ���� ����� " + (a-b));}
		else if(op=="*") {System.out.println(a + op + b + "�� ���� ����� " + (a*b));}
		else if(b==0) { System.out.println("0���� ���� �� �����ϴ�."); }
		else {System.out.println(a + op + b + "�� ���� ����� " + (a/b));}
		
		scanner.close();

	}

}
