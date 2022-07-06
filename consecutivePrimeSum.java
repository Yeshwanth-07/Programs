package Java;

import java.util.Scanner;
// import Java.time;

public class consecutivePrimeSum {
  public static boolean isPrime (int number) {

    for (int i = 2; i < number; i++) {
      if (number%i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    RunTime time = new RunTime();
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    int n = 19000;
    int count = 0;
    // time.sleep(5);
    for (int i = 2; i <= n; i++) {
      // System.out.print(i + " ");
      if (isPrime(i)) {
        int sum = 0;
        for (int j = 2; j < i; j++) {
          if (isPrime(j)) {
            sum += j;
            if (sum == i) {
              System.out.println(sum);
              count++;
              break;
            }
          }
        }
      }
    }
    System.out.println(count);
    sc.close();
    time.end();
  }
}