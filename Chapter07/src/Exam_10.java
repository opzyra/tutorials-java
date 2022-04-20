/*
 * 상속에서의 접근 지정자
 * private: 전용, 클래스밖에서 접근을 허용하지 않을때
 * default: 같은 패키지 내에서만 접근 허용
 * protected: 상속, 같은 클래스, 같은 패키지에서 접근허용
 * public: 공용, 객체만 가지고 있다면 어디서든 접근을 허용
 * */
class Z {
	
	private int a;
	public String b;
	protected String c;
	
	public Z(int a) {
		this.a = a;
	}

	// 오버로딩
	public Z(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

class Y extends Z {

	public Y(int a) {
		super(a);
	}
	
	public void display() {
		System.out.println(this.c); 
	}

	
}

public class Exam_10 {
	public static void main(String[] args) {
		Z z1 = new Z(1);
		// z1.a
		Z z2 = new Z(1, "hi");
		System.out.println(z2.b);
		
		
	}
}
