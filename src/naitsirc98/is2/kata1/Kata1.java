package naitsirc98.is2.kata1;

import java.time.LocalDate;

public class Kata1 {

	public static void main(String[] args) {
		
		Person person = new Person("Cristian", 
				LocalDate.of(1998, 7, 30));
		
		System.out.printf("%s tiene %d años",
				person.getName(), person.getAge());
		
	}

}
