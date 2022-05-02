import org.junit.Test;
import static org.junit.Assert.*;

public class FailingTest {
   @Test
   public void test1() {
       var Hotel = new Hotels();
       assertEquals("Lakewood", Hotel.GetCheaperHotel("Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)"));
   }
   @Test
   public void test2() {
       var Hotel = new Hotels();
       assertEquals("Bridgewood", Hotel.GetCheaperHotel("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)"))
   }
   @Test
   public void test3() {
       var Hotel = new Hotels();
       assertEquals("Ridgewood", Hotel.GetCheaperHotel("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)"));
   }
   
}
