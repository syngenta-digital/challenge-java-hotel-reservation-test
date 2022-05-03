import org.junit.Test;
import static org.junit.Assert.*;

public class FailingTest {
   @Test
   public void test1() {
       HotelReservation Hotel = new HotelReservation();
       assertEquals("Lakewood", Hotel.getCheaperHotel("Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)"));
   }
   @Test
   public void test2() {
       HotelReservation Hotel = new HotelReservation();
       assertEquals("Bridgewood", Hotel.getCheaperHotel("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)"));
   }
   @Test
   public void test3() {
       HotelReservation Hotel = new HotelReservation();
       assertEquals("Ridgewood", Hotel.getCheaperHotel("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)"));
   }
   
}
