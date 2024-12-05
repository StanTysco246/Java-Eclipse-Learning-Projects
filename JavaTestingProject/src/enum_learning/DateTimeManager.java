/**
 * 
 */
package enum_learning;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.*;
import java.time.format.*;
import java.util.TimeZone;


/**
 * @author ICT
 *
 */
public class DateTimeManager {
	private TimeEnum timeEnum = TimeEnum.MORNING;
	
	private LocalDate ld = LocalDate.now();
	
	private LocalDateTime ldt;
	private LocalDateTime ldt_now = LocalDateTime.now();
	
	public void getWhatTime(int h, int m) {
		ldt = LocalDateTime.of(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth(), h, m);
		/*
		if(ldt.isAfter(TimeEnum.MORNING.getStartHour()) && 
			ldt.isBefore(TimeEnum.MORNING.getEndHour())) {
			timeEnum = TimeEnum.MORNING;
			timeEnum.isMorning();
		}
		else if(ldt.isAfter(TimeEnum.AFTERNOON.getStartHour()) && 
				ldt.isBefore(TimeEnum.AFTERNOON.getEndHour())) {
			timeEnum = TimeEnum.AFTERNOON;
			timeEnum.isAfternoon();
		}
		else if(ldt.isAfter(TimeEnum.EVENING.getStartHour()) && 
				ldt.isBefore(TimeEnum.EVENING.getEndHour())) {
			timeEnum = TimeEnum.EVENING;
			timeEnum.isEvening();
		}
		else if(ldt.isEqual(TimeEnum.MIDNIGHT.getStartHour() )){
			timeEnum = TimeEnum.valueOf("MIDNIGHT");
			timeEnum.isMidnight();
		}
		else {
			timeEnum = null;
		}
		 */
		for(TimeEnum te: TimeEnum.values()) {
			if( ( ldt.isBefore(te.getStartHour()) && ldt.isAfter(te.getEndHour()) ) 
					|| ldt.equals(te.getStartHour()) ) {
				timeEnum = te;
				break;
			}
		}
		//timeEnum = TimeEnum.valueOf("NOON"); IllegalArgumentException
		System.out.println("This time is " + timeEnum.toString());
		//timeEnum.valueOf(,); 
		//timeEnum.
		//return null;
	}
	
	public void CompareWithNow(int h, int m, int s) {
		ldt = LocalDateTime.of(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth(), h, m, s);
		System.out.println("Difference time between ldt1 and now: " + ldt.compareTo(ldt_now));
	}
	
	public void printTheFirstDay() {
		//ldt = ld.with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay();
		//ldt = ld.atTime(23, 59);
		ldt = ld.withDayOfMonth(ld.lengthOfMonth()).atTime(LocalTime.MAX);
		
		System.out.println(ldt.toString());
	}
	
	public void printDate() {
		ld = ldt_now.toLocalDate();
		System.out.println(ld.toString());
	}
	
	public void isEnumNull() {
		if(timeEnum == null) {
			System.out.println("This Enum is Null");
		}
		else {
			System.out.println(timeEnum.toString());
		}
	}
	
	public void isEnumEqualToNull() {
		if(timeEnum.equals(null)) {
			System.out.println("This Enum is Null");
		}
		else {
			System.out.println(timeEnum.toString());
		}
	}
	
}
