import java.time.LocalDate;
import java.time.Period;

/*
 * 두 날짜 및 시간의 간격
 * 
 * Period => 날짜 (LocalDate)
 * Duration => 시간 (LocalTime)
 * 
 * */
public class Exam_06 {
	public static void main(String[] args) {
		LocalDate army = LocalDate.of(2010, 1, 26);
		LocalDate now = LocalDate.now();
		
		Period pe = Period.between(army, now);
		System.out.println("입대 경과년도 = " + pe.getYears());
		System.out.println("입대 경과월 = " + pe.getMonths());
		System.out.println("입대 경과일 = " + pe.getDays()); 
		
		// D-day는 어떻게?
		// LocalDate의 toEpochDay() 는 Epoch Day인 1970-01-01부터 날짜를 세어서 반환.
		long dday = now.toEpochDay() - army.toEpochDay();
		System.out.println("전역일까지 지난날 = " + dday);
	}
}
