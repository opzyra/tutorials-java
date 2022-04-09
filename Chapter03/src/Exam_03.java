/*
 * 
 * " +" : 산술연산자(더하기), 연결연산자(연결해서 작성해라)
 * 연산의 방향에 따른 결정
 * 연산방향 : 좌에서 우로 진행
 *
 */
public class Exam_03 {
	public static void main(String[] args) {
		int x = 12;
		int y = 21;
	
		System.out.println("x = " + x);
		System.out.println(x+y);
		System.out.println('A' + x + y);
		System.out.println("A" + x + y);
		System.out.println("A" + (x+y));
	}
}
