// package questions;

/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...
    int[] currentArr = nums4;
    int[] tempArr = currentArr;
    int tempInt;
    for (int j = 1; j < currentArr.length; j++) {
      for (int i = 1; i < currentArr.length; i++) {
        // System.out.println(currentArr[i - 1] + " : " + currentArr[i]);
        if (currentArr[i - 1] <= currentArr[i]) {
          tempInt = currentArr[i - 1];
          tempArr[i - 1] = currentArr[i];
          tempArr[i] = tempInt;
        } else {
          tempInt = currentArr[i - 1];
          tempArr[i - 1] = tempInt;
          tempArr[i] = currentArr[i];
        }
      }
    }
    // System.out.println(Arrays.toString(tempArr));
    System.out.println("Second Max is " + tempArr[1]);
  }
}



// not working for nums4 case (240,240)

// int secondMax;
// code here ...
// int[] currentArr = nums4;
// int Max = currentArr[0];
// for (int i = 0; i < currentArr.length; i++) {
// if (currentArr[i] > Max) {
// Max = currentArr[i];
// }
// }
// // System.out.println("max : " + Max); // int TempMax = -999;
// secondMax = currentArr[0];
// for (int i = 0; i < currentArr.length; i++) {
// if (currentArr[i] > secondMax && currentArr[i] != Max) {
// secondMax = currentArr[i];
// }
// }
// // System.out.println("Second Max is " + secondMax);
