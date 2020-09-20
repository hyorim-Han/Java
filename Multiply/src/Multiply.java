import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>> ");
			try {
				int n = scanner.nextInt(); 
				int m = scanner.nextInt(); 
				//�� �� �Է¹���. �� �� �Է¹��� ���� ������ �ƴϸ� InputMismatchException ���� �߻�.
				System.out.print(n + "x" + m + "=" + n*m);//���ܰ� ���� �� ��� ���
				break; //while�� �����
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!"); //���� ���
				scanner.nextLine();
			}
		}

	}

}
