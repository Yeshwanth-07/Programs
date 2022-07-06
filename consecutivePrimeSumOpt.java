package Java;

import java.util.Scanner;

public class consecutivePrimeSumOpt {
  public static boolean isPrime(int number) {

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
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
    int count = 0, sum = 2;
    // time.sleep(10);
    for (int i = 3; i <= n && sum <= n; i++) {
      if (isPrime(i)) {
        sum += i;
        if (isPrime(sum) && sum <= n) {
          System.out.println(sum);
          count++;
        }
      }
    }
    System.out.println(count);
    sc.close();
    time.end();
  }
}