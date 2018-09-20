package naitsirc98.is2.kata1;

import java.util.Date;

public class Kata1 {

	public static void main(String[] args) {
		
		Person person = new Person("Cristian", new Date(98,7,30));
		System.out.printf("%s tiene %d años",
				person.getName(), person.getAge());
	}

}
