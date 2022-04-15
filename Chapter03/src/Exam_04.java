/*
 * 비교연산자: ==, !=, >, >=, <, <=
 * 논리연산자: && (AND, 그리고), || (OR, 또는), ! (NOT, 부정)
 * 비트연산자: -, &, |, ~, ^(XOR) 
 * */
public class Exam_04 {
	public static void main(String[] args) {
		boolean bool = 5 < 3 && 7 >= 4;
		boolean bool1 = 10 != 11 || 7 <= 3;
		
		System.out.println("bool = " + bool); // ? false
		System.out.println("bool1 = " + bool1); // ? true
	}
}
