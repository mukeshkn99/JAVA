package DateTime;

import java.time.LocalDate;
import java.time.Period;

public class birtdeathday {

	public static void main(String[] args) {
		LocalDate birtday=LocalDate.of(1999,06,30);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birtday, today);
		System.out.printf("your age is %d years %d months and %d days ",p.getYears(),p.getMonths(),p.getDays());

		LocalDate deathday=LocalDate.of(1999+60, 06,30);
		Period p1=Period.between(today, deathday);
		int d=p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("your earth day is %d days is",d);
	}

}
