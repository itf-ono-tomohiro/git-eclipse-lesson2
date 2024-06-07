package ex1;

public class Training {
	public static void main(String[] args) {
		int x = 10;
		int y = x;
		int z = 5;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(x == y);
		System.out.println(x == z);
		
		String A = new String("abc");
		String B = A;
		System.out.println(A);
		System.out.println(B);
		System.out.println(A == B);
		
		String C = new String("abc");
		String D = new String("abc");
		System.out.println(C);
		System.out.println(D);
		System.out.println(C == D);
		int a = 1;
		int b = 1;
		int c = 2;
		if ( a == b) {
			System.out.println("aとbは等しい");
		}
		if ((a == b ) && (a == c)) {
			System.out.println("aとbは等しい、かつ、aとcは等しい");
		}
		if ((a == b ) || (a == c)) {
			System.out.println("aとbは等しい、または、aとcは等しい");
		}
		int[] array = {1,10,100,1000,10000};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int var1 = 5;
		int var2 = 10;
		if (var1 > var2) {
			System.out.println(var1 + "は" + var2 + "よりも大きい");
			
		} else  if (var1 < var2) {
			System.out.println(var1 + "は" + var2 + "よりも小さい");
			
		} else {
			System.out.println(var1 + "は" + var2 + "と等しい");
		}
		System.out.println(var1 > var2 ? "正" : "偽");
		int var = 3;
		switch(var) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default: 
			System.out.println("no");
			break;
		}
		int var3 = 2;
		switch(var3) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		case 3:
			System.out.println(3);
		default: 
			System.out.println("no");
		}
		
		int i = 0;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		
		int i2 = 10;
		do {
			System.out.println(i2);
			i2++;
		} while (i2 <= 5);
	}

}
