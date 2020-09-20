import java.util.Scanner;

public class RockSissorsPaper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String user, comp;
		String computer[] = {"����", "����", "��"}; //��ǻ�Ͱ� ���� ����� ���� �迭
		String win = ", ����ڰ� �����ϴ�", draw = ", �����ϴ�", lose = ", ����ڰ� �����ϴ�."; // ������� �迭

		while(true) {
			String result = null;
			System.out.print("���� ���� ��!>>");
			user = scanner.next(); //���� ���� �� �Է�
			if(user.equals("�׸�")) {System.out.println("������ �����մϴ�..."); break;} // �׸��̸� ����

			int n = (int)(Math.random()*3); //0,1,2 �� �����ϰ� �� ����
			comp = computer[n]; //��ǻ�Ͱ� ���� �� ����
			
			if(user.equals(computer[n])) {result = draw;} //����ڿ� ��ǻ���� ���� ������ ����
			else if(user.equals("����")) { //����ڰ� �����϶�
				if(n == 1) {result = lose;} //��ǻ�Ͱ� ������ ����ڰ� ����.
				else {result = win;} //��ǻ�Ͱ� ���̸� ����ڰ� �̱��.
			}
			else if(user.equals("����")) { //����ڰ� �����϶�
				if(n == 2) {result = lose;} //��ǻ�Ͱ� ���̸� ����ڰ� ����.
				else {result = win;} //��ǻ�Ͱ� �����̸� ����ڰ� �̱��.
			}
			else if(user.equals("��")){ //����ڰ� ���϶�
				if(n == 0) {result = lose;} //��ǻ�Ͱ� �����̸� ����ڰ� ����.
				else {result = win;} //��ǻ�Ͱ� �����̸� ����ڰ� �̱��.
			}
			System.out.println("����� = " + user + ", ��ǻ�� = " + comp + result); //��� ���
		}
		scanner.close();
	}
}