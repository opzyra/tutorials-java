/*
 * 3항연산자 : 항을 세 개 가지고 있는 연산자, if제어문의 모체가 된다.
 * 형식
 * 조건항 ?항1:항2;
 * 또는
 * 변수 = 조건항? 항1:항2
 * 참이면 1항 거짓이면 2항 실행
 * 
 *하나의 숫자를 입력받아 양수임을 확인
 * 
 * */
import java.io.*;
public class Exam_06 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		String str = "";
		
		System.out.print("숫자 = ");
		num = Integer.parseInt(in.readLine());
		
		str = num > 0? "양수":"음수";
		
		System.out.println("str = " + str);
	}
}
