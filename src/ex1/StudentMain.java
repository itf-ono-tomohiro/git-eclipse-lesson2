package ex1;

public class StudentMain {
	public static void main(String[] args) {
		Student.race = "日本人";
		
		Student tanaka = new Student();
		Student ono = new Student();
		
		tanaka.name = "田中";
		tanaka.age = 29;
		
		ono.name = "小野";
		ono.age = 29;
		
		tanaka.Self("田中です。");
		ono.Self("小野です。");
		
	}

}
