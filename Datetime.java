package Synchronization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetime 
{
	public static void main(String[] args) throws ParseException {
		String date1 = "26/04/2023";
		 Date date2 = new SimpleDateFormat("dd/MM/YYY").parse(date1);
		System.out.println(date2);
	}
}
