import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * do~while문 : 선실행 후 조건비교
 *                              - 주어진 조건이 거짓이라도 한번은 수행한다.
 * 
 * <형식>
 * do{
 * 반복할 문장;
 * }while(논리조건식);
 * 
 * 유효성검사 : 입력값을 제한할 때.
 * 
 * while(논리조건식){
 * 	반복할 문장;
 * }
 * 
 *  성적 처리 프로그램
 *  국어, 영어, 수학점수를 입력 받아서 총점과 평균 그리고 학점을 구현하여 출력하는 프로그램
 *  
 *  
 *  
 *  <처리조건>
 *  1. 입력과 출력형식에 맞게 변수와 자료형을 선언해라.
 *  2. 평균은 소숫점 이하 둘째짜리까지 표현해라.
 *  3. 평균을 이용하여 학점을 구현하되 switch-case문을 이용해라
 *  4. 각과목의 점수는 0 ~ 100 사이만 입력하되, 범위를 벗어나면 다시 입력 받도록 구현하라.
 * 
 */
public class Exam_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0; // 10~ 20사이의 숫자만 입력받음
		
		do{
			System.out.print("국어 = ");
			num = Integer.parseInt(in.readLine());
		}while(num < 0 || num > 100);
		
		System.out.println("num = " + num);
		
		}
	}
