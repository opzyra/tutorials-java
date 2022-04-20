/*
 * 클래스(Class)의 구성요소
 * 1. 멤버 필드
 *     - 접근지정자 private, 캡슐화(정보은닉)
 *     
 * 2. 생성자 메소드
 *     - 클래스명과 동일하게 작성한다.
 *     - 객체를 생성할 때 호출된다.
 *     - 멤버필드를 초기화할 목적으로 사용된다.
 *     - 결과형 리턴값을 담지 않는다.(void 조차 쓰지 않는다.)
 *     - 오버로딩(Overloading):동일한 이름을 가진 메서드를 여러개 만들어 사용할 수 있는 기능
 *       단, 매게변수의 개수가 다르거나 데이터타입이 달라야한다.
 *     - this와 this()
 *     
 * 3. 멤버 메서드
 *     - 접근지정자 : public
 *     - set~, get~
 *     - 형식
 *        접근제한자 [지정예약어] 결과형리턴값 메서드명(매개변수) throws 예외클래스{...}
 *      - 유형 4가지
 *         결과형 리턴 x 매개 x
 *         o x
 *         x o 
 *         o o
 *      - 결과형 리턴값 : 키워드(return)
 *                                         기본자료형(8대다료형), 참조자료형(클래스, 인터페이스...)
 *         
 * 4. 중첩 클래스 : 4가지
 *     1) 중첩 클래스(Inner Class)
 *          - 클래스 내부에 또 다른 클래스를 가짐으로 클래스 관리의 효율성을 높이는 것
 *          - static 포함 불가(안쪽의 중첩클래스)
 *          - 반드시 바깥쪽 객체를 생성한 후에 안쪽 객체를 생성할 수 있다.
 *          
 *     2) 정적 중첩 클래스(static Inner Class)
 *          static 담을수 있다.
 *     3) 지역 중첩 클래스(Local Inner Class)
 *     
 *     4) 익명 중첩 클래스(Anonymous Inner Class)
 *           
 * 
 * 
 * */

class Outer{
	// 맴버 필드
	int x = 100;
	private static int y = 200;
	
	// 생성자 메서드
	public Outer(){
		
	}
	// 멤버 매서드
	public void disp(){
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	// 중첩 클래스
	class Inner{
		// 맴버 필드
			private int a = 100;
			//private static int b = 200;
		// 생성자 메서드
		public Inner(){}
		// 멤버 매서드
		public void display(){
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("a = " + a);
		}
		// 중첩 클래스
		class Other_Inner{}
	}
}

public class Exam_01 {
	public static void main(String[] args){
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner(); // 중첩클래스의 경우 안쪽 중첩문에 접근하는 객체
		Outer.Inner.Other_Inner oio = oi.new Other_Inner();
		
		oi.display();
	}
}
