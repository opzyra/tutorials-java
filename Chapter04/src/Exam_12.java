import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 세개의 정수를 입력받아 큰수와 작은수를 비교하여 출력하는 프로그램을 구현하시오.
 * <입력형식>
 * 첫번재수 = 
 * 두번째수 = 
 * 세번째수 = 
 * 
 * <출력형식>
 * 가장큰수 = 
 * 가장작은수 = 
 * 
 * <처리조건>
 * 1. 음수가 입력되면 다시 입력받는다.
 * 2. 2가지 이상 동일한 수를 입력하면 에러메시지를 출력하고 프로그램을 종료한다.
 *   => 같은거 입력 ㄴㄴ
 * */
public class Exam_12 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int max = 0;
		int min = 0;
		
		// 입력
		do{
			System.out.print("첫번째수 = ");
			num1 = Integer.parseInt(in.readLine());
		}while(num1 < 0);
		
		do{
			System.out.print("두번째수 = ");
			num2 = Integer.parseInt(in.readLine());
		}while(num2 < 0);
		
		do{
			System.out.print("세번째수 = ");
			num3 = Integer.parseInt(in.readLine());
		}while(num3 < 0);
		
		// 처리
		if(num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("같은거 입력 ㄴㄴ");
			System.exit(0);
		}
		
		// num1이 가장큰 경우
		if(num1 > num2 && num1 > num3) {
			max = num1;
			min = num2 > num3 ? num3 : num2;
		} else if(num2 > num1 && num2 > num3) { // num2가 가장크다
			max = num2;
			min = num1 > num3 ? num3 : num1;
		} else { // num3가 무조건 가장크다
			max = num3;
			min = num2 > num1 ? num1 : num2;
		}
		
		System.out.println("가장큰수 = " + max);
		System.out.println("가장작은수 = " + min);
		
	}
}
