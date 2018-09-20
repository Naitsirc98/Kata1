package naitsirc98.is2.kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	
	private static final long MILLIS_PER_YEAR = 31536000000L;
	
	private final String name;
	private final Calendar birthdate;
	
	public Person(String name, Calendar birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public Calendar getBirthdate() {
		return birthdate;
	}
	
	public int getAge() {
		Calendar today = GregorianCalendar.getInstance();
		return (int) (millisToYears(today.getTimeInMillis()
				- birthdate.getTimeInMillis()));
	}
	
	private long millisToYears(long ms) {
		return ms / MILLIS_PER_YEAR;
	}

}
