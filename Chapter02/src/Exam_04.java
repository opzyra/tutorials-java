/*
 * 참조형 타입
 * String 타입
 * 문자열을 담는 참조자료형
 * 
 * 클래스
 * 
 * */
public class Exam_04 {
	public static void main(String[] args) {
		String a = "abc";
		
		System.out.println(a);
		
		String b = "1";
		int c = Integer.parseInt(b);
		System.out.println(c + 1); // 2
		
		
		int d = 1;
		String e = String.valueOf(d);
		
		System.out.println(e + 1); // ??? 11
		
	}
}
