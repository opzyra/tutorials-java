import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적 처리 프로그램을 메서드화하여 구현
 * 국어, 영어, 수학 점수를 입력받고, 총점과 평균을 출력하는 프로그램을 작성하시오. 
 * 
 * 
 */
public class Exam_07 {
	
	// 클래스 변수, 맴버필드
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int kor = 0, eng = 0, math = 0, tot = 0;
	static float avg = 0;
	
	public static void input() throws IOException {
		System.out.print("국어 = ");
		kor = Integer.parseInt(in.readLine());
		
		System.out.print("영어 = ");
		eng = Integer.parseInt(in.readLine());
		
		System.out.print("수학 = ");
		math = Integer.parseInt(in.readLine());
	}
	
	public static void process(){
		tot = kor + eng + math;
		avg = tot / 3.0f;
	}
	
	public static void output(){
		System.out.println("총점 : " + tot);
		System.out.printf("평균 = %.2f\n", avg);
	}
	
	public static void main(String[] args) throws IOException {
		input();
		process();
		output();
	}
}
