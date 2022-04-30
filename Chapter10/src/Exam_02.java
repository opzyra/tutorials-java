import java.text.DecimalFormat;

/*
 * java.text.DecimalFormat
 * 
 * 금액 단위에 콤마찍기
 * ###,###
 * 
 * 소수 출력
 * .##
 * 
 * */
public class Exam_02 {
	public static void main(String[] args) {
		int money = 302948324;
		
		DecimalFormat decFormat = new DecimalFormat("###,###");
		String moneyStr = decFormat.format(money);
		
		System.out.println(moneyStr);
		
		double doub = 3.141592;
		DecimalFormat decFormat2 = new DecimalFormat(".##");
		String doubStr = decFormat2.format(doub);
		
		System.out.println(doubStr);
	}
}
