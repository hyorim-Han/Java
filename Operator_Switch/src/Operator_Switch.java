import java.util.Scanner;

public class Operator_Switch {

	public static void main(String[] args) {
		float a, b;
		String op;
		System.out.println("����");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		op = scanner.next();
		b = scanner.nextFloat();
		
		switch(op) {
		case "+":
			System.out.println(a + " + " + b + "�� ���� ����� " + (a+b));
			break;
		case "-":
			System.out.println(a + " - " + b + "�� ���� ����� " + (a-b));
			break;
		case "*":
			System.out.println(a + " * " + b + "�� ���� ����� " + (a*b));
			break;
		case "/":
			if(b==0) { System.out.println("0���� ���� �� �����ϴ�."); }
			else {
				System.out.println(a + " / " + b + "�� ���� ����� " + (a/b));
				break;
			}
		}
		
		scanner.close();

	}

}
