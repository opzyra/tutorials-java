/*
 * 3�׿����� : ���� �� �� ������ �ִ� ������, if����� ��ü�� �ȴ�.
 * ����
 * ������ ?��1:��2;
 * �Ǵ�
 * ���� = ������? ��1:��2
 * ���̸� 1�� �����̸� 2�� ����
 * 
 *�ϳ��� ���ڸ� �Է¹޾� ������� Ȯ��
 * 
 * */
import java.io.*;
public class Exam_06 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		String str = "";
		
		System.out.print("���� = ");
		num = Integer.parseInt(in.readLine());
		
		str = num > 0? "���":"����";
		
		System.out.println("str = " + str);
	}
}
