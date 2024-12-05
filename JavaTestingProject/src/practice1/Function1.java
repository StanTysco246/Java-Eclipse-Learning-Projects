/**
 * 
 */
package practice1;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import practice2.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.TimeZone;
//import java.util.Date;
import java.time.format.DateTimeFormatter;
//import java.time.ZoneId;
/**
 * @author ICT
 *
 */




public class Function1 extends Abstract2b implements Interface1 {
	
	List<Integer> myList;
	Map<Integer, Boolean> mySet;
	
	public int myNum = 7;
	
	private Enum1 timeEnum = Enum1.MORNING;
	private Enum2 dayEnum = Enum2.SUNDAY;
	private LocalDateTime ldt = LocalDateTime.now();
	private LocalDate ld = LocalDate.now();
	private LocalDate newLD;
	private TimeZone tz;
	private TimeZone current_tz = TimeZone.getDefault();
	//private Date dt;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-YYYY HH:mm:ss");
	//private LocalDateTime ldt2;
	
	private int number = 0;
	
	protected void setNum(int x) {
		number = x;
	}
	
	protected int getNum() {
		return number;
	}
	/* 
	@Override
	protected void doMath(int x, int y) {
		System.out.println(x+y);
	}
	 */
	
	@Override
	public void printWords() {
		System.out.println("Hello World!");
	}
	
	private Enum1 getTimeNow() {
		if(ldt.isAfter(LocalDateTime.of(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth(), 3, 0, 0)) 
				&& 
			ldt.isBefore(LocalDateTime.of(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth(), 12, 0, 0))) 
		{
			return Enum1.MORNING;
		}
		else if(ldt.isAfter(LocalDateTime.of(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth(), 12, 0, 0)) 
				&& 
			ldt.isBefore(LocalDateTime.of(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth(), 18, 0, 0))) 
		{
			return Enum1.AFTERNOON;
		}
		else {
			return Enum1.EVENING;
		}
	}
	
	protected void printTimeNow() {
		
		timeEnum = getTimeNow();
		
		switch(timeEnum) {
			case MORNING:
				System.out.println("Now is morning");
				break;
			case AFTERNOON:
				System.out.println("Now is afternoon");
				break;
			case EVENING:
				System.out.println("Now is evening");
				break;
		}
	}
	
	private Enum2 getToday() {
		int dayNum = ld.getDayOfWeek().getValue();
		
		if(dayNum == 1) {
			return Enum2.MONDAY;
		}
		else if(dayNum == 2) {
			return Enum2.TUESDAY;
		}
		else if(dayNum == 3) {
			return Enum2.WEDNESDAY;
		}
		else if(dayNum == 4) {
			return Enum2.THURSDAY;
		}
		else if(dayNum == 5) {
			return Enum2.FRIDAY;
		}
		else if(dayNum == 6) {
			return Enum2.SATURDAY;
		}
		return Enum2.SUNDAY;
		
	}
	
	protected void printToday() {
		String text = "Today is ";
		dayEnum = getToday();
		
		if(dayEnum == Enum2.SUNDAY) {
			text += "Sunday";
		}
		else if(dayEnum == Enum2.MONDAY) {
			text += "Monday";
		}
		else if(dayEnum == Enum2.TUESDAY) {
			text += "Tuesday";
		}
		else if(dayEnum == Enum2.WEDNESDAY) {
			text += "Wednesday";
		}
		else if(dayEnum == Enum2.THURSDAY) {
			text += "Thursday";
		}
		else if(dayEnum == Enum2.FRIDAY) {
			text += "Friday";
		}
		else if(dayEnum == Enum2.SATURDAY) {
			text += "Saturday";
		}
		System.out.println(text);
	}
	
	protected void printTimeZoneList() {
		String [] tzList = TimeZone.getAvailableIDs();
		for(String t: tzList) {
			System.out.println(t);
		}
	}
	
	protected void printDateTimeNowByTimeZone(String id) {
		tz = TimeZone.getTimeZone(id);
		System.out.println( ldt.atZone(current_tz.toZoneId()).withZoneSameInstant(tz.toZoneId())
				.toLocalDateTime().format(dtf)
				+ " " +TimeZone.getTimeZone(id).getDisplayName());
	}
	
	@Override
	protected void printRandomNumbers(int x) {
		String str = "";
		for(int i=0; i < x; i++) {
			str += rd.nextInt(x) + " ";
		}
		System.out.println(str);
	}
	
	protected void printExpiredDate(long hour) {
		tz = TimeZone.getTimeZone("Asia/Shanghai");
		System.out.println("Login Token date now: " + ldt.format(dtf) );
		ldt = ldt.plusHours(hour);
		System.out.println("Expired Token date: " + 
		ldt.format(dtf) );
	}
	
	protected void printDate(long year) {
		System.out.println("Registration Date: " + ld.toString());
		newLD = ld.plusYears(year).plusMonths(3);
		System.out.println("Expired Date: " + newLD.toString());
	}
	
	public Function1(){
		myList = new ArrayList<>();
		mySet = new HashMap<Integer, Boolean>();
	}
	
	
	public void addNumber(int x) {
		myList.add(x);
	}
	
	public int getNumberByIndex(int index) {
		return myList.get(index);
	}
	
	public boolean isFound(int x) {
		boolean found = false;
		for(int i=0; i < myList.size(); i++) {
			if(myList.get(i) == x) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	public void FindUniqueKey() {
		for(int i=0; i < myList.size(); i++) {
			if(mySet.containsKey(myList.get(i))) {
				mySet.replace(myList.get(i), false);
			}
			else {
				mySet.put(myList.get(i), true);
			}
		}
		for(int i: mySet.keySet()) {
			if(mySet.get(i)==true) {
				System.out.println(i + " is a unique number");
			}
		}
	}
	
	public void printTriangle(int x) {
		for(int i=1; i <= x; i++) {
			for(int j=0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void printReverseTriangle(int x) {
		for(int i=x; i > 0; i--) {
			for(int j=0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void printSquare(int x) {
		for(int i=0; i < x; i++) {
			for(int j=0; j < x; j++) {
				System.out.print("HelloWorld!");
			}
			System.out.println("");
		}
	}
}
