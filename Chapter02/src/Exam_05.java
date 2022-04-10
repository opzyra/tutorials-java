/*
 * String 타입
 * 문자열을 담는 참조자료형
 * 기본자료형의 Boxing 클래스 parse
 * String클래스의 valueOf 메서드를 사용하면 상호 변환이 가능하다.
 * 
 * 변환이 불가능한경우 에러가 발생한다!
 * */
public class Exam_05 {
	public static void main(String[] args) {
		String a = "abc";
		
		System.out.println(a);
		
		String b = "1";
		int c = Integer.parseInt(b);
		System.out.println(c + 1);
		
		int d = 1;
		String e = String.valueOf(d);
		System.out.println(e+1); // 11
	}
}
