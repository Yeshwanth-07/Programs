import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class RunTime {
  final long startTime;

  RunTime() {
    startTime = System.currentTimeMillis();
  }

  void sleep(long second) {
    for (long s = second; s > 0; s--) {
      try {
        TimeUnit.SECONDS.sleep(1);
        System.out.print("\033[H\033[2J");
        System.out.print(s);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.print("\033[H\033[2J");
  }

  void end() {
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
