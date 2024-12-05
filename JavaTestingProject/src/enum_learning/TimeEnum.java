/**
 * 
 */
package enum_learning;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * @author ICT
 *
 */
public enum TimeEnum {
	MORNING (6, 12, 0){
		@Override
		public boolean isMorning() {
			System.out.println("This time is morning");
			return true;
		}
	},
	AFTERNOON (12, 18, 0){
		@Override
		public boolean isAfternoon() {
			System.out.println("This time is afternoon");
			return true;
		}
	},
	EVENING (18, 23, 59){
		@Override
		public boolean isEvening() {
			System.out.println("This time is evening");
			return true;
		}
	},
	MIDNIGHT(0,5,59){
		@Override
		public boolean isMidnight() {
			System.out.println("This time is midnight");
			return true;
		}
	}; 
	
	/*
	
	 */
	
	
	private LocalDateTime startHour;
	private LocalDateTime endHour;
	private LocalDate ld;
	
	
	TimeEnum(int h1, int h2, int m) {
		this.ld = LocalDate.now();
		this.startHour = LocalDateTime.of(ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth(),h1,0);
		this.endHour = LocalDateTime.of(ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth(),h2,m);
	}
	
	public boolean isMorning() {
		return false;
	}
	
	public boolean isAfternoon() {
		return false;
	}
	
	public boolean isEvening() {
		return false;
	}
	
	public boolean isMidnight() {
		return false;
	}
	
	public void setStartHour(int h, int m) {
		this.startHour = LocalDateTime.of(ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth(),h,m);
	}
	
	public void setEndHour(int h, int m) {
		this.endHour = LocalDateTime.of(ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth(),h,m);
	}
	
	public LocalDateTime getStartHour() {
		return this.startHour;
	}
	
	public LocalDateTime getEndHour() {
		return this.endHour;
	}
	
	
}
