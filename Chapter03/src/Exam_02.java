/*
 * ���׿�����
 * 
 * ���������� : 1�� �����ϰų� �����ϴ� ������
 * ���������� : ++a, --b
 * ���������� : a++, b--
 * 
 * ��ȣ������ : + -
*/

public class Exam_02 {
	public static void main(String[] args) {
		int x = 100; 
		int y = 0;
		System.out.println("x = " + x); 
		System.out.println("y = " + y);
		y = ++x;
		System.out.println();
		System.out.println("x = " + x); 
		System.out.println("y = " + y);
		y = x++;
		System.out.println();
		System.out.println("x = " + x); 
		System.out.println("y = " + y);
		
		int a = -1;
		int b = +1; // ����� �����Ǿ��ִ�..
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
