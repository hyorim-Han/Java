import java.util.Scanner;
class manageSeat{ //�¼� ���� Ŭ����
	private String seats[]; //�¼� �迭
	
	public manageSeat() {
		seats = new String[10]; //�� �ٿ� �� ���� �¼� ����
		
		for(int i = 0; i < 10; i++) {
			seats[i] = "---";
		} //�¼� �ʱ�ȭ
	}
	
	public void showCurrentSeats() { //��� ���� ���� ���� ��Ȳ ���
		for(int i = 0;i < 10;i++) {
			System.out.print(seats[i] + " ");
		}
		System.out.println();
	}
	
	public boolean bookSeat(String name, int n) {
		if(seats[n-1].equals("---")) { //�����ϰ��� �ϴ� �ڸ��� ��������� ����
			seats[n - 1] = name;
			return true;
		}
		return false;
	}
	
	public boolean cancelSeat(String name) {
		for(int i = 0;i < 10;i++) { //�ش� �̸��� �¼� ���
			if(seats[i].equals(name)) {
				seats[i]="---";
				return true;
			}
		}
		return false;
	}
	
}

class bookingSystem{ //�ܼ�Ʈ ���� �ý���
	Scanner scanner = new Scanner(System.in);
	private manageSeat s[]; //�¼�
	private String grade[] = {"S", "A" ,"B"}; //�¼� ���
	
	public bookingSystem() {
		s = new manageSeat[3];
		for(int i = 0; i < 3; i++) {
			s[i] = new manageSeat();
		}
	}
	
	public void booking() { //����
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int num = scanner.nextInt();
		System.out.print(grade[num-1] + ">>");
		s[num-1].showCurrentSeats();
		
		System.out.print("�̸�>>");
		String name = scanner.next();
		System.out.print("��ȣ>>");
		int n = scanner.nextInt();
		
		boolean result = s[num-1].bookSeat(name, n); //���� �õ��� ��� �޾ƿ�.
		
		if(result == false) { //�̹� ����� �¼��̶�� �Լ��� �ٽ� �ҷ��� ��õ�
			System.out.println("<<<�̹� ����� �¼��Դϴ�. �ٽ� �õ��� �ּ���.>>>");
			this.booking();
		}
	}
	
	public void printAll() { //��ȸ
		for(int i = 0; i < 3; i++) {
			System.out.print(grade[i] + ">>");
			s[i].showCurrentSeats();
		}
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
	public void canceling() { //���
		System.out.print("�¼� S:1, A:2, B:3>>");
		int num = scanner.nextInt();
		System.out.print(grade[num-1] + ">>");
		s[num-1].showCurrentSeats();
		
		System.out.print("�̸�>>");
		String name = scanner.next();
		
		boolean result = s[num-1].cancelSeat(name); //��� �õ��� ��� �޾ƿ�.
		
		if(result == false) { //��ġ�ϴ� ������ ������ �Լ��� �ٽ� �ҷ��� ��õ�
			System.out.println("<<<��ġ�ϴ� �̸� ������ �����ϴ�. �ٽ� �õ��� �ּ���.>>>");
			this.canceling();
		}
		else {System.out.println("<<<��Ҹ� �Ϸ��Ͽ����ϴ�.>>>");} //��� �Ϸ� �޼��� ���
	}
	
	public void running() { //�ý���
		int op;
		
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			op = scanner.nextInt();
			
			switch(op) {
			case 1: //����
				this.booking();
				break;
			case 2: //��ȸ
				this.printAll();
				break;
			case 3: //���
				this.canceling();
				break;
			case 4: //����
				return;
			}
		}
	}
}

public class concertBooking {

	public static void main(String[] args) {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		bookingSystem b = new bookingSystem();
		b.running();

	}

}
