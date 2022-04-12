import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 하나의 65 ~ 90 또는 97 ~ 122 사이의 양의정수를 입력 받아
 * 양의 정수를 문자로 변환하여 출력하는 프로그램을 작성하시오.
 * 
 * <입력 및 출력 양식>
 * 입력
 * 양의정수 입력 = 65 
 * 
 * 출력
 * A
 * 
 * <처리조건>
 * 1. 만약 65 ~ 90, 97 ~ 122사이의 양의정수가 아닌경우 반복해서 입력할수 있도록 구현한다. => do while 문을 사용할것
 * 
 * */
public class Program_04 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number;
		char ch;
		
		do {
			System.out.print("양의정수 입력 = ");
			number = Integer.parseInt(in.readLine());
		}while(!(number >= 65 && number <=90 || number >= 97 && number <= 122));
		
		ch = (char)number;
		
		System.out.println(ch);
		
	}
}
