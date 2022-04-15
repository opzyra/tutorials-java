/*
 * 쉬프트 연산: 산술적인 계산과 논리적인 계산(단순히 자료를 이동하는 역할)
 * [1/0][1/0][1/0][1/0] 4비트
 * 
 * Left Shift: 좌측이동 => 곱하기 <<
 * Right Shift: 우측이동 => 나누기
 * 
 * 이진법
 * 0 1 이루어진수
 * 10진법 => 2진법
 * 0 => 00
 * 1 => 01
 * 2 => 10
 * 3 => 11
 * */
public class Exam_05 {
	public static void main(String[] args) {
		int x = 1 << 3; // 0001 => 1000 10진수 8
		int y = 8 >> 3; // 1000 => 0001 10진수 1
		
		System.out.println("x = " + x);
		System.out.println("y = " + y); 
	}
}
