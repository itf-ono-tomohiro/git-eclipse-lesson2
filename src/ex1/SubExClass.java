package ex1;

public class SubExClass extends ExClass {
	public void increase(int i) {
		int x = i * 100;
		System.out.println(x);
	}
	public void increase2(int i) {
		super.increase(i);
	}

}
