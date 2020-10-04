/* AbstractClassEx */

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract double average(int[] a);
}

class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) { return a+b; } //추상 메소드
	
	@Override
	public int substract(int a, int b) { return a-b; } //추상 메소드
	
	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}		
		return sum/a.length;
	} // 추상 메소드
}

public class Practice_07 {
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.substract(2,3));
		System.out.println(c.average(new int[] {2, 3, 4}));

	}

}
