
/*
 * this 키워드와 this()의 설명
 * this : 클래스내에 자기 자신의 객체를 가르키는 키워드
 * this() : this 메서드 / 클래스내에 자신의 또 다른 생성자를 호출하는 메서드
 * 
 */

class SomeObject {
	int a,b,c,d,e,f,g,h;
	
	// default 생성자 - 멤버필드를 초기화시켜준다.
	SomeObject() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		e = 50;
		f = 60;
		g = 70;
		h = 80;
	}
	
	SomeObject(int a) {
		this(); // super() - 상속관계에서는 부모 클래스의 생성자를 호출한다.
		this.a = a;
		b = 20;
		c = 30;
		d = 40;
		e = 50;
		f = 60;
		g = 70;
		h = 80;
	}
	
	SomeObject(int a, int b) {
		this(a);
//		this.a = a;
		this.b = b;
//		c = 30;
//		d = 40;
//		e = 50;
//		f = 60;
//		g = 70;
//		h = 80;
	}
	
	public void display(){
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
	}
}

public class Exam_11 {
	public static void main(String[] args) {
		SomeObject so1 = new SomeObject();
		so1.display();
		
		System.out.println();
		SomeObject so2 = new SomeObject(5);
		so2.display();
		
		System.out.println();
		SomeObject so3 = new SomeObject(54, 22);
		so3.display();
	}
}
