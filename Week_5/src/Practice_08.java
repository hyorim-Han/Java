/* InterfaceEx */

interface PhoneInterface{ 
	final int TIMEOUT = 10000; //��� �ʵ�
	void sendCall(); //�߻� �޼ҵ�
	void receiveCall(); //�߻� �޼ҵ�
	default void printLogo() { System.out.println("** Phobe **"); }; //����Ʈ �޼ҵ�
}

class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() { System.out.println("�츮������"); } 
	//PhoneInterface�� sendCall �޼ҵ� ����
	
	@Override
	public void receiveCall() { System.out.println("��ȭ�� �Խ��ϴ�.");	}
	//PhoneInterface�� receiveCall �޼ҵ� ����
	
	public void flash() { System.out.println("��ȭ�⿡ ���� �������ϴ�."); };
	//�߰� �޼ҵ� ����
}

public class Practice_08 {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
