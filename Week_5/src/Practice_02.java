/* InheritanceEx */

class Person{
	private int weight; //Student Ŭ���� ���� �Ұ�
	int age; //����Ʈ, Student Ŭ���� ���� ����
	protected int height; //Student Ŭ���� ���� ����
	public String name; //Student Ŭ���� ���� ����
	
	public void setWeight(int weight) {
		this.weight = weight;
	} //������ ����
	
	public int getWeight() {
		return weight;
	} //������ ��ȯ
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		//weight = 99; ���� Ŭ������ private ��� ���ٺҰ�//
		setWeight(99); //Person Ŭ������ setWeight �Լ��� ���� �������� 
	}
	
	public void showInfo() {
		System.out.println(name + "�� ���̴� " + age + "���̰�, Ű�� " 
				+ height + "�̸� �����Դ�" + getWeight() + "�Դϴ�");
	} // ���� ���
}
public class Practice_02 {
	
	public static void main(String[] args) {
		Student s = new Student(); //Student ��ü ����
		s.set(); //���� ����
		s.showInfo(); //���� ���
	}

}
