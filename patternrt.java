public class patternrt {
  public static void main(String[] args) {
    int num = 10;
    for (int row = 1; row <= num; row++) {
      for (int col = 1; col <= row; col++) {
        int max = ((num % 2 == 0) ? (num / 2) : (num / 2 + 1));
        for (int select = 1; select <= max; select++) {
          if (col == select || row == num - select + 1) {
            System.out.print(select);
            break;
          }
        }
      }
      System.out.println();
    }
  }
}
