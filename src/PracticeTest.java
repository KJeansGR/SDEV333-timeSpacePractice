import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  @Test
  void testMostCommonTimeEfficient(){
    //a
      int[] testArray = new int[]{1,2,2,3,3,3,3,3,4,4,4,4};
    //a
      int result = Practice.mostCommonTimeEfficient(testArray);
    //assert
    assertEquals(3, result);
  }

  @Test
  void testMostCommonSpaceEfficient() {
    int[] array = new int[]{5, 6, 1, 5, 99, 1, 5, 42, 1};
    int result = Practice.mostCommonSpaceEfficient(array);
    assertEquals(5, result);
  }
}
