import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * java.util.Date
 * java.util.Calendar
 * java.text.SimpleDateFormat
 * 
 * Sat Apr 30 17:19:17 KST 2022
 * 
 * yyyy - 년도 2022
 * MM - 월 4
 * dd - 일 30
 * HH - 시간 (24시간)
 * hh - 시간 (12시간)
 * mm - 분
 * ss - 초
 * 
 * 
 * */
public class Exam_03 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("Date~");
		
		System.out.println(date);
		
		// 권장하지 않는다.. 사선;
		System.out.println(date.getYear()); // ???
		System.out.println(date.getMonth()); // JS처럼 0부터 시작한다!
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		System.out.println();
		System.out.println("Calendar~");
		
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		Date calDate = cal.getTime(); // Calendar => Date
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); // JS처럼 0부터 시작한다!
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		System.out.println(calDate);
		
		System.out.println();
		System.out.println("SimpleDateFormat~");
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		// String result = df.format(cal); ERROR
		String result = df.format(cal.getTime());
		System.out.println(result);
		
		SimpleDateFormat df2 = new SimpleDateFormat("yy.MM.dd");
		System.out.println(df2.format(cal.getTime()));
	}
}
