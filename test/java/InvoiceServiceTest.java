import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25,fare,0.0);
    }

    @Test
    public void givenDistanceAndTime_ForMultipleRides_ShouldReturnTotalFare() {

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distanceFor1 = 3.0;
        int timeFor1 = 6;
        double distanceFor2 = 8.0;
        int timeFor2 = 10;
        double totalFare = invoiceGenerator.calculateFareForMultipleRides(distanceFor1, timeFor1,distanceFor2,timeFor2);
        Assertions.assertEquals(126.0,totalFare,0.0);
    }

    @Test
    public void givenDistanceAndTime_ForMultipleRides_ShouldReturnTotalNumberOFRides_TotalFare_AverageFarePerRide() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distanceFor1 = 3.0;
        int timeFor1 = 6;
        double distanceFor2 = 8.0;
        int timeFor2 = 10;
        int totalNumOfRides = 2;
        System.out.println(invoiceGenerator.enhancedInvoice(totalNumOfRides,distanceFor1, timeFor1,distanceFor2,timeFor2));
    }

    @Test
    public void givenUserId_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        int userId = 11;
        List<Integer> invoice = invoiceGenerator.invoiceService(userId);
        System.out.println(invoice);

    }

    @Test
    public void givenDistanceAndTime_ForPremiumRides_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distanceForNormal = 3.0;
        int timeForNormal = 6;
        double distanceForPremium = 8.0;
        int timeForPremium = 10;
        int normalRides  = 1;
        int premiumRides = 2;
        double normalRidesFare = invoiceGenerator.premiumRides(normalRides,distanceForNormal,timeForNormal);
        Assertions.assertEquals(36,normalRidesFare);

        double premiumRidesFare = invoiceGenerator.premiumRides(premiumRides,distanceForPremium,timeForPremium);
        Assertions.assertEquals(180,premiumRidesFare);
    }
}
