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
}
