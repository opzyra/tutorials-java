/*
 * 상속관계에서의 우선적용과 접근
 * 
 * 부모클래스 타입(자료형)으로 자식클래스 객체를 생성하면, 부모클래스의 능력으로 제한된다.
 * - 자식클래스에서 오버라이딩 한 메서드는 자식클래스의 메서드로 실행된다.
 * - 자식클래스에서 정의한 맴버변수는 사용이 불가능하다.
 * 
 * 자식클래스 타입(자료형)으로 부모클래스의 객체를 생성할수는 없다.
 * 
 * 다형성 표현
 * - 다형성이란?
 *   부모 객체를 통해서 자식객체를 표현하는 방법
 * - 맴버 필드의 다형성 표현
 *   부모 객체의 필드만 접근이 가능하다.
 * - 맴버 메서드의 다형성 표현
 *   자식 객체의 메서드를 먼저 수행한다.
 *   자식 객체에 해당하는 메서드가 없다면, 부모객체의 메서드를 실행한다.
 * */

class AAA {
	private String a = "부모";
	
	public void display() {
		System.out.println("부모 메서드");
	}
	
	// 오버로딩 => 같은이름의 메서드이지만 매개변수가 다르면 선언이 가능하다.
	public void display(String message) {
		System.out.println("부모" + message);
	}
	
	public String getA() {
		return a;
	}
}

class BBB extends AAA {
	private String a = "자식";
	
	// 오버라이딩
	public void display() {
		
		System.out.println("자식 메서드");
		
		System.out.println(a);
	}
	
	public String getA() {
		return super.getA();
	}
	
	
}

public class Exam_16 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		AAA bbb = new BBB(); // 다형성
		
		// aaa.display();
		System.out.println();
		bbb.display();
		// System.out.println(bbb.a); // 자식
		
		System.out.println(bbb.getA());
	}
}
