/*
 * 배열(Array) : 동일한 자료형을 하나의 이름으로 묶어서 관리하는 자료구조
 *  - 자료구조 ?  (데이터를 저장하는 틀)
 *  	변수(Variable) : 하나의 데이터를 저장하는 기억공간
 *  	배열(Array) : 동일한 자료형 ~
 *		구조체(struct) : 서로 다른 자료형을 묶어
 *		클래스(class)
 * 
 * 1. 단일차운배열(1차원 배열)
 *    - 배열의 첨자를 1개 가지고 있는 배열
 *    - 장점
 *      기억장소의 낭비를 줄임
 *      연속된 공간을 할당받아 자료를 저장하기 때문에 처리속도가 빠르다.
 *      유사문구가 생성되어 반복처리가 가능하다. (for문)
 */
public class Exam_01 {
	public static void main(String[] args) {
		int x;
		int y;
		int z; // 래퍼런스 영역에 12byte의 영역이 필요함(줄 일수 있다!)
		x = 0; y = 0; z = 0;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		// 배열의 선언
		// 자료형[] 변수 
		
		// 배열의 초기화
		// 자료형[] 변수 = new 자료형[배열의 크기(첨자)];
		
		int[] a;
		a = new int[3]; // 각 공간에 defualt 초기화;
		
		for(int i = 0; i < 3;  i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
