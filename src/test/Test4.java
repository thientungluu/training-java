package test;

import java.time.YearMonth;
import java.util.Scanner;

/*Viết chương trình Java để lấy tên của ngày đầu tiên và ngày cuối cùng của tháng.*/
public class Test4 {
	public static void main(String[] args) {
		YearMonth yearMonth=YearMonth.of(2019, 11);
		String first =yearMonth.atDay(1).getDayOfWeek().name();
		System.out.println("Ngày đầu tiên của tháng:"+first);
		String last = yearMonth.atEndOfMonth().getDayOfWeek().name();
		System.out.println("Ngày cuối cùng của tháng:"+last);	
	}
}
