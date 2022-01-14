package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!
    @BeforeEach
    public void setUp(){

    }
    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(21);
        Assertions.assertEquals(26, result);
    }
//
//    @Test
//    public void addFiveToMinus20() {
//        int result = new GettingStarted().addFive(???);
//        Assertions.assertEquals(????,result);
//    }
}
