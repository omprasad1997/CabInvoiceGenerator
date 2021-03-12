import java.util.*;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;

    public double calculateFare(double distance, int time) {
        return distance*MINIMUM_COST_PER_KILOMETER + time*COST_PER_TIME;
    }

    public double calculateFareForMultipleRides(double distanceFor1, int timeFor1,double distanceFor2,int timeFor2) {
        return (distanceFor1+distanceFor2)*MINIMUM_COST_PER_KILOMETER + (timeFor1+timeFor2)*COST_PER_TIME;
    }

    public String enhancedInvoice(int totalNumOfRides, double distanceFor1, int timeFor1, double distanceFor2, int timeFor2) {
        double totalFare = (distanceFor1+distanceFor2)*MINIMUM_COST_PER_KILOMETER + (timeFor1+timeFor2)*COST_PER_TIME;
        double averageFarePerRide = totalFare/totalNumOfRides;
        return "Total number Of Rides: " + totalNumOfRides +"\n"+ "Total Fare: "+totalFare+"\n"
                + "Average Fare Per Ride: " + averageFarePerRide;
    }
}
