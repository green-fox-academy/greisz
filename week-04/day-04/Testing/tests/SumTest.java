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
}