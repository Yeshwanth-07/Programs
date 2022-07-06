package Java;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String input = sc.next();
    System.out.print("Enter Number: ");
    int num = sc.nextInt();
    for (int i = 0; i < input.length(); i++) {
      for (int j = 0; j < num; j++) {
        if (i%2 == 0) {
          System.out.println((Character.toUpperCase(input.charAt(i))));
        } else {
          System.out.println((Character.toLowerCase(input.charAt(i))));
        }
      }
      // System.out.print((Character.toString((i%2 == 0)?((Character.toUpperCase(input.charAt(i)))):(Character.toLowerCase(input.charAt(i))))).repeat(num));
    }
    sc.close();
  }
}
