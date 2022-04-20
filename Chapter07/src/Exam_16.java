/*
 * 상속관계에서의 우선적용과 접근
 * 
 * 부모클래스 타입(자료형)으로 자식클래스 객체를 생성하면, 부모클래스의 능력으로 제한된다.
 *	- 자식클래스에서 오버라이딩 한 메소드는 자식클래스의 메소드로 실행된다.
 *	- 자식클래스에서 정의한 멤버변수는 사용이 불가하다. 
 *
 * 자식클래스 타입(자료형)으로 부모클래스의 객체를 생성할 수는 없다.
 * 
 * 다형성의 표현
 * 	1) 다형성이란?
 * 		- 부모 객체를 통해 자식 객체를 표현하는 방법
 * 	2) 멤버 필드의 다형성 표현
 * 		- 부모 객체의 필드만 접근이 가능하다.
 * 	3) 멤버 메서드의 다형성 표현
 * 		- 자식 객체의 메서드를 먼저 수행
 * 		- 자식 객체에 해당 메서드가 없다면 부모 객체의 메서드 실행
 * */
class AAA {
	// private String a = "부모";
	protected String a = "부모";
	
	public void display() {
		System.out.println("부모 메서드");
	}
	
	// 같은 이름의 메서드 이지만 매개변수가 다르면 선언이 가능하다. => 오버로딩
	public void display(String message) {
		System.out.println("부모 " + message);
	}
}

class BBB extends AAA {
	public String a = "자식";
	
	// 오버라이딩
	public void display() {
		super.display();
		System.out.println(a);
		System.out.println(super.a);
	}
}


public class Exam_16 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		AAA bbb = new BBB(); // 다형성
		
		aaa.display(); // 부모의 display
		System.out.println();
		bbb.display(); // 자식의 display
		
		System.out.println(bbb.a); // 자식객체의 맴버필드에 접근이 불가능하다! 
	}
}
