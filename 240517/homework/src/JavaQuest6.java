// package src.questions;

public class JavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int a = 0;
    int b = 1;
    int sum = 1;
    int count = 0;
    for (int i = 0; i < 100; i++) {
      if (count==15) {
        break;
      }
      System.out.print(sum + " ");
      sum = a + b;
      a = b;
      b = sum;
      count+=1;
    }
  }
}

// 0 loop a=0  b=1  c=1
// 1 loop a=1  b=1  c=2
// 2 loop a=1  b=2  c=3
// 3 loop a=2  b=3  c=5
// 3 loop a=3  b=5  c=8


// 0	0	1	1
// 1	1	1	2
// 2	1	2	3
// 3	2	3	5
// 4	3	5	8
// 5	5	8	13
// 6	8	13	21
// 7	13	21	34
// 8	21	34	55
// 9	34	55	89
// 10	55	89	144
// 11	89	144	233
// 12	144	233	377
// 13	233	377	610
// 14	377	610	987
// 15	610	987	1597

