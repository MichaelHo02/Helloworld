import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class labNum2 {
    public static void main(String[] args) {
        // input data
        String month;
        month = input_month();
        int year = input_year();
        // calculate
        int day = calculate(month, year);
        // compose string
        // display
        System.out.println(month + " " + year + " has " + day + " days");
    }
    public static int input_year() {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a year: ");
        return user.nextInt();
    }
    public  static String input_month() {
        String month;
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a month: ");
        month = user.nextLine();
        return format_month(month);
    }
    public static int calculate(String month, int year) {
        int monthInt = convert_month(month);
        if (((monthInt < 8) && (monthInt % 2 == 1)) || ((monthInt > 7) && (monthInt % 2 == 0))){
            return 31;
        } else if (monthInt == 2){
            return 29;
        } else return 30;
    }
    public static int convert_month(String month) {
        HashMap<String, Integer> calendar = new HashMap<String, Integer>();
        // add value
        System.out.println(month);
        calendar.put("Jan", 1);
        calendar.put("Feb", 2);
        calendar.put("Mar", 3);
        calendar.put("Apr", 4);
        calendar.put("May", 5);
        calendar.put("Jun", 6);
        calendar.put("Jul", 7);
        calendar.put("Aug", 8);
        calendar.put("Sep", 9);
        calendar.put("Oct", 10);
        calendar.put("Nov", 11);
        calendar.put("Dec", 12);
        // select
        return calendar.get(month);
    }
    public static String format_month(String month) {
        month = month.toLowerCase();
        char[] newString = month.toCharArray();
        newString[0] = Character.toUpperCase(newString[0]);
        month = String.valueOf(newString);
        return month;
    }
}
