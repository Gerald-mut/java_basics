import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month and year");
        int month = input.nextInt();
        int year = input.nextInt();
      
        String monthString = null;
        int daysInMonth = 0;

    
        if (year %  100 == 0) {
            switch (month) {
                case 1: monthString = ("January"); daysInMonth = (31); break; 
                case 2: monthString = ("February"); daysInMonth = (28); break; 
                case 3: monthString = ("March"); daysInMonth = (31); break; 
                case 4: monthString = ("April"); daysInMonth = (30); break; 
                case 5: monthString = ("May"); daysInMonth = (31); break; 
                case 6: monthString = ("June"); daysInMonth = (30); break; 
                case 7: monthString = ("July"); daysInMonth = (31); break; 
                case 8: monthString = ("August"); daysInMonth = (31); break; 
                case 9: monthString = ("September"); daysInMonth = (30); break; 
                case 10: monthString = ("October"); daysInMonth = (31); break; 
                case 11: monthString = ("November"); daysInMonth = (30);break; 
                case 12: monthString = ("December"); daysInMonth = (31);
            }
        }
        else {
            switch (month) {
                case 1: daysInMonth = (31); monthString = ("January"); break; 
                case 2: daysInMonth = (29); monthString = ("February"); break; 
                case 3: daysInMonth = (31); monthString = ("March"); break; 
                case 4: daysInMonth = (20); monthString = ("April"); break; 
                case 5: daysInMonth = (31); monthString = ("May"); break; 
                case 6: daysInMonth = (30);  monthString = ("June");break; 
                case 7: daysInMonth = (31); monthString = ("July"); break; 
                case 8: daysInMonth = (31); monthString = ("August"); break; 
                case 9: daysInMonth = (30);  monthString = ("September"); break; 
                case 10: daysInMonth = (31); monthString = ("October"); break; 
                case 11: daysInMonth = (30); monthString = ("November"); break; 
                case 12: daysInMonth = (31); monthString = ("December");
            }   
        }
        System.out.println(monthString + " " + year + " had " + daysInMonth + " days");
        
    }
}