
package demo;
import java.util.Scanner;

public class Month{
	
	public static void main(String[] args)
	{

    int DaysMonth = 0; 
    String MonthName = "Unknown";
    Scanner input = new Scanner(System.in);

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

    switch (month) {
        case 1:
            MonthName = "January";
            DaysMonth = 31;
            break;
        case 2:
            MonthName = "February";
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                DaysMonth = 29;
            } else {
                DaysMonth = 28;
            }
            break;
        case 3:
            MonthName = "March";
            DaysMonth = 31;
            break;
        case 4:
            MonthName = "April";
            DaysMonth = 30;
            break;
        case 5:
            MonthName = "May";
            DaysMonth = 31;
            break;
        case 6:
            MonthName = "June";
            DaysMonth = 30;
            break;
        case 7:
            MonthName = "July";
            DaysMonth = 31;
            break;
        case 8:
            MonthName = "August";
            DaysMonth = 31;
            break;
        case 9:
            MonthName = "September";
            DaysMonth = 30;
            break;
        case 10:
            MonthName = "October";
            DaysMonth = 31;
            break;
        case 11:
            MonthName = "November";
            DaysMonth = 30;
            break;
        case 12:
            MonthName = "December";
            DaysMonth = 31;
    }
    System.out.print(MonthName + " " + year + " has " + DaysMonth + " days\n");
}
}

   