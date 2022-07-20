public class squarepattern {
  public static void main(String[] args) {
    int num = 5;
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        int m = ((num%2==0)?(num/2):(num/2+1));
        for (int k = 1; k <= m; k++) {
          if(j == k || i == num - k + 1 || i == k || j == num - k + 1){
            // System.out.print(k); //small to larger
            System.out.print(m - k + 1); //larger to small
            break;
          }
        }
      }
      System.out.println();
    }
  }
}
