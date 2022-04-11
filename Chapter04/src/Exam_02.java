/*
 *  if, if~else, if ~ elseif
 */
public class Exam_02 {
	public static void main(String[] args) {
		// 조건문
		if(true) {
			System.out.println("참");
		}
		
		boolean a = true;
		
		if(a) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		int b = 1;
		int c = 2;
		
		if(b > c) {
			System.out.println("크다");
		} else if(b < c) {
			System.out.println("크다");
		} else {
			System.out.println("같다");
		}
	}
}
