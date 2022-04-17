/*
 *  객체지향적인 프로그래밍 : JAVA
 *  객체 : 현실세계의 유형, 무형의 모든 물질
 *  프로그래밍 => 자동화
 *  1. 클래스(class) : 객체를 프로그래밍 하는 구조(틀) < = 객체 모델링
 *      속성(attribute) - 필드(Field = Variable) = 변수, 기억공간 
 *      기능(function) - 함수 = 메서드, 명령어의 집합, 기능의 묶음, 행위나 동작등을 기술하는 영역
 *      
 *      1) 형식
 *      	접근제한자(접근지정자) [지정예약어] class 클래스명{}
 *      
 *      2) 구성요소(포함맴버)
 *      	- 맴버 필드(클래스 변수) : Member Field
 *      	- 생성자 메서드 : Constructor
 *      	- 맴버 메서드 : Member Method
 *      	- 중첩 클래스 : Nested Class = Inner Class
 *      	(1개의 자바파일에 1개의 클래스만 원칙적으로 담을수 있다.)
 *          (private)      
 *         
 *  	3) 객체를 생성하는 방법
 *  	   클래스명 객체명 = new 생성자메서드(매개변수)
 *  	   - 객체명은 Reference 영역에 할당된다.
 *         - 객체명은 4byte 객체이다.
 *           
 *           
 *     4) 객체를 통해 맴버에 접근하는 방법 : direct연산자
 *        객체명.멤버필드 or 객체명.멤버메서드();
 *           
 */

class Person {
	// 클래스변수, 맴버필드
	String name;
	
	// 생성자 메서드 => 클래스명과 같은이름 + ()
	// 작성하지 않으면 생략되어 있다. => 디폴트 생성자
	// public Person() {}
	
	public Person(String name) {
		// 매개변수의 변수는 지역변수로 우선적용된다.
		// 메서드 안에서 클래스변수, 맴버필드에 접근할때는 this 키워드를 사용한다.
		this.name = name;
	};
	
	// 생성자는 매개변수의 타입, 매개변수의 갯수가 다른경우 여러개 작성이 가능하다.
	// => 오버로딩 이라고 한다.
	public Person(int age) {}
	
	/*
	 * 객체가 생성될 때 호출되는 메서드
	 * 생성자 메서드가 존재하지 않으면 default 생성자가 생략되어 있는 걸로 간주한다.
	 * default 생성자란 매개변수를 가지고 있지 않은 생성자
	 * 메서드이긴 하지만 결과형 리턴값을 담고 있지 않다. 심지어 void조차 쓰면 안된다.
	 * 멤버필드를 초기화시킬 목적으로 구현된 메서드이다.
	 * 객체가 생성된후 처음으로 해야할 작업을 기술할 목적으로 구현한다.
	 * 생성자 메서드는 반드시 클래스명과 동일하게 작성된다.
	 * 생성자도 오버로딩이 가능하다. => 동일한 이름을 가진 메서드를 여러개 만들어서 사용하는 기능
	 * 단, 매개변수의 개수가 다르거나, 데이터 타입(자료형)이 달라야 한다.
	 * this키워드, this()메서드의 구현이 가능하다.
	 * this : 클래스 내에 자기 자신의 객체를 가르킨다.
	 * this() : 클래스내의 자신의 또 다른 생성자를 가르킨다.
	 * */
	
	// 맴버 메서드: 객체가 하는 행위나 동작등을 기술하는 영역
	public void init(String irum){
		name = irum;
	}
	
	public void walk(int speed){
		System.out.println(name + "이/가 " + speed +"km/s의 속도로 걸어갑니다.");
	}
	
	public void run(int speed){
		System.out.println(name + "이/가 " + speed + "km/s의 속도로 뛰어갑니다.");
	}
	
	//중첩 클래스(GUI 이벤트 처리, 모바일)
	class Baby{
		String leftLeg;
		String rightLeg;
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		Person people1 = new Person("장보고");
		people1.walk(10);
		people1.run(25);
	}
}
