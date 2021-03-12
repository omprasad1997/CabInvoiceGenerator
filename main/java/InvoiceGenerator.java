import java.util.*;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double PREMIUM_MINIMUM_COST_PER_KILOMETER = 20;
    private static final int PREMIUM_COST_PER_TIME = 2;

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


    public List<Integer> invoiceService(int userId) {
        ArrayList<Integer> userId_11= new ArrayList<Integer>();
        userId_11.add(111);userId_11.add(123);userId_11.add(423);
        ArrayList<Integer> userId_12= new ArrayList<Integer>();
        userId_12.add(135);userId_12.add(145);userId_12.add(500);

        Map<Integer, ArrayList<Integer>> booksRepository = new HashMap<>(){{
            put(11,userId_11);
            put(12,userId_12);
        }};

        return booksRepository.get(userId);
    }

    public double premiumRides(int ride, double distance, int time) {
        if(ride == 1)
            return distance*MINIMUM_COST_PER_KILOMETER + time*COST_PER_TIME;
        else
            return distance*PREMIUM_MINIMUM_COST_PER_KILOMETER + time*PREMIUM_COST_PER_TIME;
    }
}
