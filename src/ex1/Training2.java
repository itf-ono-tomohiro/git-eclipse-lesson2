package ex1;

public class Training2 {

	public static void main(String[] args) {
		for(int i= 0; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i2= 0; i2 <= 5; i2++) {
			if (i2 == 3) {
				continue;
			}
			System.out.println(i2);
		}
		
		int total = 0;
		int number[] = {1,2,3,4,5};
		for(int score:number) {
			total += score;
		}
		System.out.println("合計" + total);
		
	}

}
