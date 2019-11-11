package test;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
Viết chương trình Java để hiển thị ngày theo các định dạng
Default format of LocalDate=2016-09-16                                                                        
16::Sep::2016                                                                                                 
Default format of LocalDateTime=2016-09-16T11:46:01.455                                                       
16::Sep::2016 11::46::01                                                                                      
Default format of Instant=2016-09-16T06:16:01.456Z                                                            
Default format after parsing = 2014-04-27T21:39:48 
*/
public class Test5 {
	public static void main(String[] args) {
		//LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("Default format of LocalDate:"+localDate);
		String specificDate=localDate.format(DateTimeFormatter.ofPattern("dd::MMM::yyyy"));
		System.out.println(specificDate);
		
		//LocalDateTime
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println("Default format of LocalDateTime:"+localDateTime);
		String specificTime=localDateTime.format(DateTimeFormatter.ofPattern("dd::MMM:yyy HH::mm::ss"));
		System.out.println(specificTime);
		
		//Instant
		Instant timestamp= Instant.now();
		System.out.println("Default format of Instant:"+timestamp);
		
		//Parse
		LocalDateTime lcDateTime=LocalDateTime.parse("11-Nov-2019 14::01::28",DateTimeFormatter.ofPattern("dd-MMM-yyyy HH::mm::ss"));
		System.out.println("Default format after parsing:"+lcDateTime);
	}
}
