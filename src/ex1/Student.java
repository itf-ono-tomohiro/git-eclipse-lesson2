package ex1;

public class Student {
	public static String race;
	public String name;
	public int age;
	
	public void Self(String mess) {
		System.out.println("名前は" + name);
		System.out.println("年齢は" + age);
		System.out.println("自己紹介は" + mess);
		System.out.println("国籍は" + race);
		System.out.println("----------------");
		
	}
}
