/*
 * Call By Reference
 * => 참조(주소)에 의한 호출
 *    메서드에 참조형 데이터를 매개변수로 받아 처리하는 경우 해당 매개변수의 참조 데이터를 변경시킨다.
 * */
public class Exam_05 {
	
	public static void changeName(Human human, String name) {
		human.name = name;
	}
	
	public static void main(String[] args) {
		Human human = new Human("홍길동");
		
		System.out.println(human.name); // 홍길동
		changeName(human, "깁감순");
		
		System.out.println(human.name); // 홍길동? => 김갑순
	}
}

// 클래스문법.. 나중에 다시보자
/*
var human = {
	name: "홍길동"
}

console.log(human.name); // 홍길동
human.name = "김갑순";
console.log(human.name); // 김갑순
*/
class Human {
	public String name;
	
	public Human(String name) {
		this.name = name;
	}
}
