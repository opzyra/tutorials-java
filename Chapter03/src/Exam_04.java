/*
 * 비교연산자 : ==, !=, >, >=, <, <=
 * 논리연산자 : && (AND), || (OR) , ! (NOT)
 * 비트연산자 : -, &, |, ~ , ^(XOR)
 *  
 */
public class Exam_04 {
	public static void main(String[] args){
		boolean bool = 5 < 3 && 7 >= 4; // false && true - > false  
		boolean bool1 = 10 != 11 || 7 <= 3; // true || false - > true
		
		System.out.println("bool = " + bool);
		System.out.println("bool1 = " + bool1);
		
	}
}
