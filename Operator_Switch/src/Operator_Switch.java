import java.util.Scanner;

public class Operator_Switch {

	public static void main(String[] args) {
		float a, b; //�Ǽ��� ���� 2��
		String op;
		System.out.println("����");
		Scanner scanner = new Scanner(System.in); //���� �Է�
		a = scanner.nextFloat();
		op = scanner.next();
		b = scanner.nextFloat();
		
		switch(op) {
		case "+":
			System.out.println(a + op + b + "�� ���� ����� " + (a+b));
			break; //�����ڰ� +�̸� ���ϱ� ���� �� ���
		case "-":
			System.out.println(a + op + b + "�� ���� ����� " + (a-b));
			break; //�����ڰ� -�̸� ���� ���� �� ���
		case "*":
			System.out.println(a + op + b + "�� ���� ����� " + (a*b));
			break; //�����ڰ� *�̸� ���ϱ� ���� �� ���
		case "/":
			if(b==0) { System.out.println("0���� ���� �� �����ϴ�."); break;} //�����ڰ� /�̰� b�� 0�̸� ���� ���
			else {
				System.out.println(a + op + b + "�� ���� ����� " + (a/b));
				break;//b�� 0�� �ƴϸ� ������ ���� ���� �� ���
			}
		}
		scanner.close();
	}

}
