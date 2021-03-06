
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {
  
  Extension extension = new Extension();
  
  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }
  
  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }
  
  @Test
  void testMaxOfThreeFirst() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }
  
  @Test
  void testMaxOfThreeSecond() {
    assertEquals(5, extension.maxOfThree(3, 5, 4));
  }
  
  @Test
  void testMaxOfThreeThird() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }
  
  @Test
  void testMaxOfThreeTwoEqual() {
    assertEquals(5, extension.maxOfThree(3, 5, 5));
  }
  
  @Test
  void testMaxOfThreeAllEqual() {
    assertEquals(5, extension.maxOfThree(5, 5, 5));
  }
  
  @Test
  void testMedianUnorderedFour() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }
  
  @Test
  void testMedianFive() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }
  
  @Test
  void testMedianUnorderedFive() {
    assertEquals(3, extension.median(Arrays.asList(5,2,1,3,4)));
  }
  
  @Test
  void testMedianOrderedSix() {
    assertEquals(3.5, extension.median(Arrays.asList(1,2,3,4,5,6)));
  }
  
  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }
  
  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }
  
  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }
  
  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}