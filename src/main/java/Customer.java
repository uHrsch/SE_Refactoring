import java.lang.*;
import java.util.*;

public class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            // add frequent renter points
            frequentRenterPoints += each.getFrequentRenterPoints();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getMovie().getCharge(each.getDaysRented())) + "\n";

        }
        //add footer lines
        result += "Amount owed is " +
                getTotalCharge() + "\n";
        result += "You earned " + frequentRenterPoints
                +
                " frequent renter points";
        return result;

    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration enumRentals = rentals.elements();
        while (enumRentals.hasMoreElements()) {
            Rental each = (Rental) enumRentals.nextElement();
            result += each.getMovie().getCharge(each.getDaysRented());
        }
        return result;
    }


}