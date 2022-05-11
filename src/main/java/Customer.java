import java.lang.*;
import java.util.*;

public class Customer {
    private String name;
    private ArrayList rentals = new ArrayList<Rental>();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.add(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        int frequentRenterPoints = 0;
        ArrayList enumRentals = rentals;
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        int i = 0;
        while (i < enumRentals.size()) {
            Rental each = (Rental) enumRentals.get(i);
            // add frequent renter points
            frequentRenterPoints += each.getFrequentRenterPoints();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getMovie().getCharge(each.getDaysRented())) + "\n";
            i++;
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
        ArrayList enumRentals = rentals;
        double result = 0;
        int i = 0;
        while (i < enumRentals.size()) {
            Rental each = (Rental) enumRentals.get(i);
            result += each.getMovie().getCharge(each.getDaysRented());
            i++;
        }
        return result;
    }


}