package Java;

import java.util.*;
import java.util.concurrent.TimeUnit;

class RunTime {
  final long startTime;

  RunTime() {
    startTime = System.currentTimeMillis();
  }

  void measureTime() {
    long milliSecond = System.currentTimeMillis() - startTime;
    long hour = milliSecond / 3600000;
    milliSecond = milliSecond % 3600000;
    long minutes = milliSecond / 60000;
    milliSecond = milliSecond % 60000;
    long second = milliSecond / 1000;
    milliSecond = milliSecond % 1000;
    System.out.print("Runtime: ");
    if (hour > 0) {
      System.out.println(hour + ((hour == 1) ? (" Hour ") : (" Hours "))
          + minutes + ((minutes == 1 || minutes == 0) ? (" Minute ") : (" Minutes "))
          + second + ((second == 1 || second == 0) ? (" Second ") : (" Seconds "))
          + milliSecond + ((milliSecond == 1 || milliSecond == 0) ? (" MilliSecond ") : (" MilliSeconds ")));
    } else if (minutes > 0) {
      System.out.println(minutes + ((minutes == 1) ? (" Minute ") : (" Minutes "))
          + second + ((second == 1 || second == 0) ? (" Second ") : (" Seconds "))
          + milliSecond + ((milliSecond == 1 || milliSecond == 0) ? (" MilliSecond ") : (" MilliSeconds ")));
    } else if (second > 0) {
      System.out.println(second + ((second == 1) ? (" Second ") : (" Seconds "))
          + milliSecond + ((milliSecond == 1 || milliSecond == 0) ? (" MilliSecond ") : (" MilliSeconds ")));
    } else {
      System.out.println(milliSecond + ((milliSecond == 1 || milliSecond == 0) ? (" MilliSecond ") : (" MilliSeconds ")));
    }
  }
}
public class permutation {
  static boolean isDesc(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i] < arr[i+1]) {
        return false;
      }
    }
    return true;
  }
  static int factorial(int f) {
    if (f == 1) {
      return 1;
    }
    return f * factorial(f-1);
  }
  static int[] reverse(int[] arr, int start, int end) {
    for (int i = start, j = end; i <= j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    return arr;
  }
  static int[] nextPermute(int[] arr) {
    int a = 0, aind = 0, bind = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i - 1] < arr[i]) {
        a = arr[i - 1];
        aind = i - 1;
        break;
      }
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] > a) {
        bind = i;
        break;
      }
    }
    int temp = arr[aind];
    arr[aind] = arr[bind];
    arr[bind] = temp;
    arr = reverse(arr, aind+1, arr.length-1);
    return arr;
  }
  public static void main(String[] args) {
    RunTime t = new RunTime();
    int[] arr = { 1, 1, 1, 1};
    Arrays.sort(arr);
    System.out.format("%3d", 1);
    System.out.print(": ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int per = 1; per < factorial(arr.length) && !isDesc(arr); per++) {
      arr = nextPermute(arr);
      System.out.format("%3d", per+1);
      System.out.print(": ");
      for (int i : arr) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    t.measureTime();
  }
}
