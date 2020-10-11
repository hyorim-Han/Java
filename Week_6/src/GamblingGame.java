import java.util.Scanner;

class gameResult{
	private int n1, n2, n3;
	public String name;
	public gameResult(String name) {
		this.name = name;
	}
	public boolean runGame() { 
		n1 = (int)((Math.random()*3)+1); //���� �Լ��� ���� 1,2,3 �� �� ���� ���ڸ� �̴´�
		n2 = (int)((Math.random()*3)+1);
		n3 = (int)((Math.random()*3)+1);
		System.out.print(n1 + " " + n2 + " " + n3 + " "); //���� ���� ���
		if((n1 == n2) && (n2==n3)) {return true;} //�� ���ڰ� ������ true ����
		else {return false;}
	}
}
public class GamblingGame {

	public static void main(String[] args) {
		int num;
		String name;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		num = s.nextInt();
		
		gameResult[] person = new gameResult[num]; //��ü ����
		for(int i = 0; i < num; i++) {
			System.out.print(i+1 + "��° ���� �̸�>>");
			name = s.next();
			person[i] = new gameResult(name);
		}
		
		String buffer = s.nextLine();
		while(true) {
			for(int i = 0; i < num; i++) {
				System.out.print("[" + person[i].name + "]:<Enter>");
				buffer = s.nextLine();
				if(person[i].runGame()) { //gameResult Ŭ������ runGame �Լ��� ��ȯ���� true�̸� �¸�
					System.out.println(person[i].name + "���� �̰���ϴ�!");
					s.close();
					return;
				}
				System.out.println("�ƽ�����!");
			}
		}
	}

}
