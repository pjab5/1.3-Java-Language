package Level1.Exercise1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<Month>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
        Month august = new Month("August");
        months.add(7,august);
        System.out.println("List with the months:");
        for (Month month: months){
            System.out.println("The month with index " + months.indexOf(month) + " is " + month.getName());
        }
        HashSet<Month> HSmonths = new HashSet<>(months);
        System.out.println("\nBefore adding a duplicate the size is: " + HSmonths.size());
        HSmonths.add(august);
        System.out.println("After adding a duplicate the size is: " + HSmonths.size());
        System.out.println("\nHashSet with the months:");
        for (Month month: HSmonths){
            System.out.println(month.getName());
        }
    }
}