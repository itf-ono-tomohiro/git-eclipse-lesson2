package ex1;

public class InstanceStatic {
	//インスタンス変数の宣言と初期化b
	int instanceVal = 10;
	
	//スタティック変数の宣言と初期化
	static int staticVal = 100;
	
	//インスタンス変数の宣言と初期化
	void instanceMethod() {
		System.out.println(instanceVal);
	}
	
	//インスタンス変数の宣言と初期化
	static void staticMethod() {
		System.out.println(staticVal);
	}
	

}
