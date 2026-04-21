import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonTimeEfficient(){
    //a
      int[] testArray = new int[]{1,2,2,3,3,3,3,3,4,4,4,4};
    //a
      int result = Practice.mostCommonTimeEfficient(testArray);
    //assert
    assertEquals(3, result);
  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
