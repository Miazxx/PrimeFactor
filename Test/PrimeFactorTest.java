import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class PrimeFactorTest {


    private  ArrayList<Integer> resultList;
    private  PrimeFactor primeFactor;


    @Before
    public void setUp() throws Exception {
        resultList = new ArrayList<Integer>();
        primeFactor = new PrimeFactor();
    }


    @Test
    public void shouldReturn2For2() throws Exception {

        resultList.add(2);
        assertEquals(resultList, primeFactor.calculate(2));

    }

    @Test
    public void shouldReturn2and2For4() throws Exception {

        resultList.add(2);
        resultList.add(2);
        assertEquals(resultList, primeFactor.calculate(4));

    }

    @Test
    public void shouldReturn2and3For6() throws Exception {

        resultList.add(2);
        resultList.add(3);
        assertEquals(resultList, primeFactor.calculate(6));

    }

    @Test
    public void shouldReturn2and2and3For12() throws Exception {

        resultList.add(2);
        resultList.add(2);
        resultList.add(3);
        assertEquals(resultList, primeFactor.calculate(12));

    }

    @Test
    public void shouldReturn2and5For10() throws Exception {

        resultList.add(2);
        resultList.add(5);
        assertEquals(resultList, primeFactor.calculate(10));

    }

    @Test
    public void shouldReturn3and3and3and3For81() throws Exception {

        resultList.add(3);
        resultList.add(3);
        resultList.add(3);
        resultList.add(3);
        assertEquals(resultList, primeFactor.calculate(81));

    }


}
