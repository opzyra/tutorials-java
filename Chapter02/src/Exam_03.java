/*
 * Boxing, Unboxing
 * Boxing(�ڽ�)�� ���� Ÿ���� ���� Ÿ������ ��ȯ ��Ű�� ���� ���ϰ�, Unboxing(��ڽ�)�� ���� Ÿ���� ���� Ÿ������ ��ȯ ��Ű�� ���� ���Ѵ�.
 * 
 * Ư¡
 * 1. ����Ÿ���� null�� ���� �� ������, ���� Ÿ���� �����ϴ�.
 * 2. ���ʸ� Ÿ�Կ��� ��� ����
 * 
 * Auto Boxing / Unboxing
 * �ڵ���ȯ
 * 
 * */
public class Exam_03 {
	public static void main(String[] arg) {
		int a = 1;
		Integer b = 1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		// System.out.println(a instanceof int);
		System.out.println(b instanceof Integer);
		
		// int c = null;
		Integer d = null;
		System.out.println(d);
		
		int e = 2;
		Integer f = e;
		
		System.out.println(f);
		System.out.println(f instanceof Integer);
		
	}
}
