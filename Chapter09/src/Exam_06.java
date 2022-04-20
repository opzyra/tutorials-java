/*
 * 기존의 String이 불변의 속성을 가진 객체이기때문에 한계가 있다
 * 따라사 유사배열처럼 사용할수 있는 가변의 String Builder, String Buffer가 등장했다!
 * 
 * String        : 문자열 연산이 적고 멀티쓰레드 환경일 경우
 * StringBuffer  : 문자열 연산이 많고 멀티쓰레드 환경일 경우
 * StringBuilder : 문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우
 * 
 * */
public class Exam_06 {
	public static void main(String[] args) {
		StringBuffer sbuf = new StringBuffer("a");
		System.out.println(sbuf);
		
		sbuf.append("b");
		sbuf.append("c");
		sbuf.append("d");
		
		System.out.println(sbuf); // abcd
		
		sbuf.delete(0, 1);
		
		System.out.println(sbuf); // bcd
		System.out.println(sbuf.length()); // 3
	}
}
