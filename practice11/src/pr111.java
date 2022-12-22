import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
public class pr111 {
        public static void main(String[] args) throws ParseException {

            pr111 c = new pr111();
            c.startFinish();
            c.compareTo();
            c.dateCalendar();
        }
         public void startFinish() {
             System.out.print("\n Start - 15.11.2022");
             Date now = new Date();
             SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.YYYY");
             System.out.print("\n Finish- ");
             System.out.println(dateFormatter.format(now));
         }

         public void compareTo() throws ParseException {
             System.out.println("\nEnter the date");
             Scanner sc = new Scanner(System.in);
             String day3 = sc.nextLine();
             int value = Integer.parseInt(day3.replaceAll("[^0-9]", ""));
             while ((day3.charAt(2) != '.') || (day3.charAt(5) != '.') || (day3.charAt(2) != '.') || value / 1000000 > 30) {
                 System.out.println("Incorrect ");
                 day3 = sc.nextLine();
                 value = Integer.parseInt(day3.replaceAll("[^0-9]", ""));
             }
             // System.out.print("\nВведите месяц ");

             SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.YYYY");
             Date day1 = dateFormatter.parse(day3);
             // sc.close();
             Date day2 = new Date();

             if (day1.getTime() < day2.getTime()) {
                 System.out.println("The date is earlier ");
             } else {
                 System.out.println("The date ois later");
             }
         }

         public void dateCalendar() {
             Scanner sc = new Scanner(System.in);
             System.out.println("\nEnter the year");
             int year1 = sc.nextInt();
             System.out.println("\nEnter the month");
             int month1 = sc.nextInt();

             System.out.println("\nEnter the day");
             int d = sc.nextInt();
             Calendar calendar = new GregorianCalendar(year1, month1, d);

           //  System.out.println("\nEnter hours and minutes");

             System.out.println("\nEnter the hour");
             int hour1 = sc.nextInt();
             System.out.println("\nEnter the minute");
             int minute1 = sc.nextInt();
             Date date = new Date(0, 0, 0, hour1, minute1);
         }

        }