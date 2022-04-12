import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 계산기 프로그램
 * 두 개의 정수와 하나의 여산자를 입력받아 계산을 수행한 후 결과를 출력하는 프로그램을 구현하시오.
 * 
 * <입력 및 출력형식>
 * 첫번째수 = 10
 * 연산자(+,-,*,/,%) = %
 * 두번째수 = 3
 * 
 * 10 % 3 = 1
 * 
 * <처리조건>
 * 1.입출력형식을 이용하여 변수와 자료형을 알맞게 선언할 것.
 * 2. 주어진 연산기호이외의 값이 들어오면 다시 입력받도록 구현한다.
 * 3. 연산자가 '/'이고 두번째수가 0이 들어오면 두번째수를 다시 입력받도록 구현한다.
 * 
 * int 변수 3개 , char 변수 1개
 * 
 */
public class Program_03 {
	public static void main(String[] args) throws IOException{
		//선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0, num2 = 0, result = 0;
		char ch = 0;
		
		//입력
		System.out.print("첫번째 수 = ");
		num1 = Integer.parseInt(in.readLine());
		
		do{
			System.out.print("연산자(+, -, *, /, %) = ");
			ch = (char) System.in.read();
			in.readLine();
			//System.in.read();
			//System.in.read();
		}while(ch != '*' && ch != '/' && ch!= '+' && ch!='-' && ch!='%' && ch!='*');
		
		do{
		System.out.print("두번째 수 = ");
		num2 = Integer.parseInt(in.readLine());
		}while(ch == '/' && num2 == 0);
		
		//처리
		
		switch(ch){
		case '*':
			result = num1 *num2; 
			break;
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			;
		}
		
		//출력
		System.out.println();
		System.out.println(num1 + " " + ch + " "  + num2 + " = " + result);
		
	}
}
