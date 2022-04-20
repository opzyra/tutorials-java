/*
 * Interface에 포함될 수 있는 멤버
 * - public static final 멤버필드 = 리터럴상수
 * - abstract(추상) 멤버 메서드
 * - static inner class 정적 중접 클래스
 * 
 * 인터페이스는 클래스를 상속받을수 없다.
 * */
interface AA {
	public static final int X = 10;
	// private String no;
	
	// public void display() {}
	
	public void display();
}

class BB implements AA {

	@Override
	public void display() {
		System.out.println("재정의된 메서드!!");
		System.out.println(X);		
	}
	
}

public class Exam_12  {
	public static void main(String[] args) {
		
		// 부모 객체로 자식객체를 담아 생성할수 있다! => 다형성
		AA aa = new BB();
		aa.display();
	}
	
}
