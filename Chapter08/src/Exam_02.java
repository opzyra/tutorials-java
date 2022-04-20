
public class Exam_02 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
			System.out.println(0/0); // 0으로 나누니 예외가 발생한다!
			System.out.println(5); // 실행되지 않고 catch구문으로 이동
		} catch (Exception e) {
			System.out.println(6);
		}
	}
}
