
import java.util.Scanner;

public class CircleNesting {

	public static void main(String[] args) {
		int x1, y1, x2, y2, r1, r2;
		double distance;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�");
		x1 = scanner.nextInt(); //ù���� ���� x��ǥ
		y1 = scanner.nextInt(); //ù���� ���� y��ǥ
		r1 = scanner.nextInt(); //ù���� ���� ������
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("�ι��� ���� �߽ɰ� ������ �Է�");
		x2 = scanner1.nextInt(); //�ι�° ���� x��ǥ
		y2 = scanner1.nextInt(); //�ι��� ���� y��ǥ
		r2 = scanner1.nextInt(); //�ι��� ���� ������

		distance = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);

		if(distance>(r1 + r2)) {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�."); //�߽� ������ �Ÿ��� �� ���� �������� ������ �պ��� ũ�� ��ġ�� �ʴ´�.
		}
		else {
			System.out.println("�� ���� ���� ��ģ��."); //�׷��� ������ ��ģ��.
		}
		scanner.close();
		scanner1.close();
	}

}