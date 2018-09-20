package naitsirc98.is2.kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

	public static void main(String[] args) {
		
		Calendar date = GregorianCalendar.getInstance();
		date.set(1998, 7, 30);
		
		Person person = new Person("Cristian", date);
		
		System.out.printf("%s tiene %d años",
				person.getName(), person.getAge());
	}

}
