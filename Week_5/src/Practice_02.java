/* InheritanceEx */

class Person{
	private int weight; //Student 클래스 접근 불가
	int age; //디폴트, Student 클래스 접근 가능
	protected int height; //Student 클래스 접근 가능
	public String name; //Student 클래스 접근 가능
	
	public void setWeight(int weight) {
		this.weight = weight;
	} //몸무게 설정
	
	public int getWeight() {
		return weight;
	} //몸무게 반환
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		//weight = 99; 슈퍼 클래스의 private 멤버 접근불가//
		setWeight(99); //Person 클래스의 setWeight 함수를 통한 간접접근 
	}
	
	public void showInfo() {
		System.out.println(name + "의 나이는 " + age + "살이고, 키는 " 
				+ height + "이며 몸무게는" + getWeight() + "입니다");
	} // 정보 출력
}
public class Practice_02 {
	
	public static void main(String[] args) {
		Student s = new Student(); //Student 객체 생성
		s.set(); //정보 설정
		s.showInfo(); //정보 출력
	}

}
