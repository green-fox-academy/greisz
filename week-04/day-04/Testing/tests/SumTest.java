import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum;
  
  @Before
  public void setUp() {
    sum = new Sum();
  }
  
  @Test
  public void sumAll() {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
    assertEquals(10, sum.sumAll(list));
  }
  
  @Test
  public void emptyList() {
    ArrayList<Integer> list = new ArrayList<Integer>();
    assertEquals(0, sum.sumAll(list));
  }
  
  @Test
  public void sumOnlyOne() {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2));
    assertEquals(2, sum.sumAll(list));
  }
  
  @Test(expected = NullPointerException.class)
  public void testExceptionMessage() {
    sum.sumAll(null);
  }
  
}