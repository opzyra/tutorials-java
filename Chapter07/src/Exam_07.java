/*
 * class static 블록
 * static 필드를 제어할 목적으로 사용되는 메서드로 static만 담을 수 있다.
 * 클래스가 로딩될때 static 필드를 초기화할 수 있다. 
 */

class Bank { 
	private String name;
	private static float rate;
	private double money;
	static{ // 초기화 구문
		rate = 0.03f;
	}
	
	public Bank(String name, float rate, double money){
		this.name = name;
		Bank.rate = rate;
		this.money = money;
	}
	
	public void disp(){
		System.out.println("name : " + name);
		System.out.println("rate : " + rate);
		System.out.println("money : " + money);
	}
}

public class Exam_07 {
	public static void main(String[] args){
		Bank aaa = new Bank("aaa", 0.09f, 1000.0); // 초창기 은행고객
		aaa.disp();
		System.out.println();
		
		Bank bbb = new Bank("bbb", 0.05f, 1000.0);// 중반기 은행고객
		aaa.disp();
		bbb.disp();
		System.out.println();
		
		Bank ccc = new Bank("ccc", 0.07f, 1000.0); // 후반기 은행고객
		aaa.disp();
		bbb.disp();
		ccc.disp();
	}
}
