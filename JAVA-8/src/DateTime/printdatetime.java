package DateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class printdatetime {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.of(1995, Month.APRIL,28,12,45);
		System.out.println(dt);
		System.out.println("After six months:"+dt.plusMonths(6));
		System.out.println("Before six months:"+dt.minusMonths(6));

	}

}
