package sbeans;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePrinter {

	private LocalDate currentDate;
	
	public DatePrinter(LocalDate currentDate)
	{
		this.currentDate = currentDate;
	}
	
	public LocalDate getCurrentDate()
	{
		return currentDate;
	}

	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
		
	}
	
	public void printDate()
	{
//		DecimalFormat df = new DecimalFormat("00:00:0000");
		
	DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-YYYY");
//		System.out.println("Today is : "+currentDate.format(formate));
		
		
		System.out.println("Today is : "+currentDate.format(formate));
	}
	
}
