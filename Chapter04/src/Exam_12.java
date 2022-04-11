import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * 세 개의 정수를 입력받아 큰순서대로 나열하여 출력하는 프로그램을 구현하시오.
 *<입력형식>
 *	첫번째수 = 
 * 두번쨰수 = 
 * 세번째수 = 
 *
 *
 *<출력형식>
 *수나열 : 큰수 >= 중간수 >= 작은수
 *
 * 매소드 : 버퍼더리더
 * 변수 : int형 3개
 *
 */
public class Exam_12 {
	public static void main(String[] ar) throws IOException {

		//선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0, num2 = 0, num3 = 0;
		int temp = 0; // 자리바꿈을 위한 임시변수
		
		//입력
		System.out.print("첫번째수 = ");
		num1 = Integer.parseInt(in.readLine());
		
		System.out.print("두번째 수 = ");
		num2 = Integer.parseInt(in.readLine());
		
		System.out.print("세번째 수 = ");
		num3 = Integer.parseInt(in.readLine());
		
		//처리
		
		
		//만약에 가장 큰수가 num1에 없다면?
		if(num2 >= num1 && num2 >= num3){//1 = 10 //2 = 9 //3 = 12
			temp = num1;
			num1 = num2;
			num2 = temp;
		}else if(num3 >= num1 && num3 >= num2){
			temp = num3;
			num3 = num1;
			num1 = temp;
		}
		
		if(num3 >= num2){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		//출력
		System.out.println();
		System.out.println("수나열 =  " + num1 + ">=" + num2 + ">=" + num3);

	}
}
