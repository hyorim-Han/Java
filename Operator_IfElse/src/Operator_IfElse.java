import java.util.Scanner;

public class Operator_IfElse {

	public static void main(String[] args) {
		float a, b;
		String op;
		System.out.println("����");
		Scanner scanner = new Scanner(System.in); //���� �Է�
		a = scanner.nextFloat(); 
		op = scanner.next();
		b = scanner.nextFloat();
		
		if(op.equals("+")) { System.out.println(a + op + b + "�� ���� ����� " + (a+b)); } //�����ڰ� +�̸� ���ϱ� ���� ����
		else if(op.equals("-")) { System.out.println(a + op + b + "�� ���� ����� " + (a-b)); } //�����ڰ� -�̸� ���� ���� ����
		else if(op.equals("*")) { System.out.println(a + op + b + "�� ���� ����� " + (a*b)); } //�����ڰ� *�̸� ���ϱ� ���� ����
		else if(b == 0) { System.out.println("0���� ���� �� �����ϴ�."); } //b�� 0�̸� ���� ���
		else { System.out.println(a + op + b + "�� ���� ����� " + (a/b)); } //b�� 0�� �ƴϸ� ������ ���� ����
		
		scanner.close();

		}
}

