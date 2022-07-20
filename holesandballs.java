import java.util.Scanner;
public class holesandballs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no_holes = sc.nextInt();
    int [] holes = new int[no_holes];
    for (int i = 0; i < holes.length; i++) {
      holes[i] = sc.nextInt();
    }
    int no_balls = sc.nextInt();
    int [] balls = new int[no_balls];
    for (int i = 0; i < balls.length; i++) {
      balls[i] = sc.nextInt();
    }
    int [] count = new int[no_holes];
    int [] ans = new int[no_balls];
    for (int i = 0; i < balls.length; i++) {
      for (int j = 0; j < holes.length; j++) {
        if (balls[i] <= holes[j] && count[j] < j+1) {
          count[j]++;
          ans[i] = j+1;
          break;
        }
      }
    }
    for (int i = 0; i < ans.length; i++) {
      System.out.println(ans[i]);
    }
    sc.close();
  }
}
