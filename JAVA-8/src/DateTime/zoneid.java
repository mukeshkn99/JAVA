package DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zoneid {

	public static void main(String[] args) {
		ZoneId id=ZoneId.systemDefault();
		System.out.println(id);
		
        ZoneId currentdatetime=ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt=ZonedDateTime.now(currentdatetime);
        System.out.println(zt);
	}

}
