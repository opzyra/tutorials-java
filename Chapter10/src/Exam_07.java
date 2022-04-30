import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * String to LocalDateTime
 * 
 * 사용자가 입력한 정보는 대부분 문자열인데..
 * LocalDate로 어떻게 변환하는가?
 * 
 * 문자열에 해당하는 양식의 포멧터를 선언하고
 * Local객체의 parse메서드를 활용하여 변환한다!
 * 
 * */
public class Exam_07 {
	public static void main(String[] args) {
		String dateTimeStr = "2021-11-05 13:47:13.248";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
		System.out.println(dateTime);
	}
}
