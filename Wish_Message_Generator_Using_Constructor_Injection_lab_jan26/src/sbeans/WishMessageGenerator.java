package sbeans;

import java.time.*;

public class WishMessageGenerator {
	
	private LocalDateTime currentDateTime;
	
	public WishMessageGenerator(LocalDateTime currentDateTime)
	{
		this.currentDateTime = currentDateTime;
	}

	public LocalDateTime getCurrentDateTime() {
		return currentDateTime;
	}

	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	
	
	public void showMessage()
	{
		int hour = currentDateTime.getHour();
		
		if (hour < 12){
			System.out.println("Good Morning");
		}
		else if (hour >= 12 && hour < 18){
			System.out.println("Good Afternoon");
		}
		else {
			System.out.println("Good Evening");
		}
	}

}
