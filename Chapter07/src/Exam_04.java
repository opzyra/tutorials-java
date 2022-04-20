/*
 * 자바에서의 생략된 개념들
 *	- import java.lang.*;
 *	- this
 *	- toString()
 *	- extends Object
 *	- super()
 *
 * */
import java.lang.*;
public class Exam_04 extends Object {
	private String name;

	public Exam_04() {
		super();
	}
	
	// 클래스를 출력하려고할때 호출되는 메서드
	@Override
	public String toString() {
		return "Exam_04 [name=" + this.name + "]";
	}
	
}
