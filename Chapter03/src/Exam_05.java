/*
 * 쉬프트 연산 : 산술적인 계산과 논리적인 계산(단순히 자료를 이동하는 역할)
 * Left Shift : 좌측이동, 곱하기
 * Right Shift : 우측이동, 나누기
 * 
 */
public class Exam_05 {
	public static void main(String[] args){
		int x = 1 << 3; // 0001 = > 1000 
		int y = 8 >> 3; // 1000 = > 0001
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
}
