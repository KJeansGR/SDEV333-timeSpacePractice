import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Practice {

  // Time Complexity:O(n)
  // Space Complexity:O(n)
  // N = input array
  // Remember to define your variables!
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Assume a rectangular array where #rows <= #cols
  // Time Complexity:  O r
  // Space Complexity: o(1)
  // Remember to define your variables! r = matrix.length
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  
  // Time Complexity: O(n)
  // Space Complexity: O(u)
  // where n = array.length and u = unique values in array
  // Remember to define your variables!
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    Map<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }
  

  // Time Complexity: O(n^2), because the loop explicitly runs n*n times
  // Space Complexity: O(n^2), because the number of elements is n*n/2, and since 2 is 
  // a constant, we drop it
  // Where n is the value of the integer passed in
  // Remember to define your variables!
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  // Time Complexity: o(n)
  // Space Complexity: o(n)
  // n = concatVals
  // Remember to define your variables!
  public static List<Integer> concatVals(Map<Integer, List<Integer>> map) {
    List<Integer> result = new ArrayList<>();

    for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
      for(int num : entry.getValue()) {
        result.add(num);
      }
    }
    return result;
  }

  // Time Complexity: o(1)
  // Space Complexity: o(1)
  // n =  input char
  // Remember to define your variables!
  public static List<Character> septuple(char c) {
    List<Character> result = new ArrayList<>();
    for(int i = 0; i < 7; i++) {
      result.add(c);
    }
    return result;
  }

  // Time Complexity: O(rows*cols)
  // Space Complexity: O(rows*cols)
  // Where rows are the number of rows in the 2D char array, and cols are 
  // the number of columns in that array
  // Remember to define your variables!
  public static char[][] initCharRect(int rows, int cols) {
    return new char[rows][cols];
  }

  // Assume all strings in strs are of length s
  // Hint: charAt is an O(1) operation in both time and space
  // Time Complexity: O(strs.length*str.length())
  // Space Complexity: O(strs.length*str.length())
  // Where strs.length is the length of the list, and str.length() 
  // is the length of the string being checked over
  // Remember to define your variables!
  public static List<Character> concatStrings(List<String> strs) {
    List<Character> concat = new ArrayList<>();
    for(String str : strs) {
      for(int i = 0; i < str.length(); i++) {
        concat.add(str.charAt(i));
      }
    }
    return concat;
  }

  // Time Complexity: o(1)
  // Space Complexity: O(1)
  // variables do not matter for this problem
  // Remember to define your variables!
  public static int cubic(int n, int a, int b, int c, int d) {
    int result = d;
    result += c * n;
    result += b * n * n;
    result += a * n * n * n;
    return result;
  }


  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.length
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.length
    Map<Integer, Integer> map = new LinkedHashMap<>();
      for(int n : nums){
        if(!map.containsKey(n)){
          map.put(n, 1);
        }
        else{
          map.put(n, map.get(n) +1);
        }
      }
      int curKey = -1;
      int curMax = Integer.MIN_VALUE;

      for(var v : map.entrySet()){
        int key = v.getKey();
        int val = v.getValue();
        if(val > curMax){
          curMax = val;
          curKey = key;
        }
      }
      
    return curKey;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    return -1;
  }
}