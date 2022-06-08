package Com.cg.Date_and_Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("before formatting what is your date?" + myDateObj);
		DateTimeFormatter formateobj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(formateobj);
		
		System.out.println("After formatting the date is :" + formattedDate);
		
	}

}

