package DateTime;

import java.time.LocalDate;

public class getdate {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		int day=date.getDayOfMonth();
		int month = date.getMonthValue();
        int year = date.getYear();
        System.out.printf("%d-%d-%d",day,month,year);
	}

}
