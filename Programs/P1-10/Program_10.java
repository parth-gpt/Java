//Program to convert temperature from *C to F;
import java.util.Scanner;

public class Program_10{
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);

    float C, F;

    System.out.println("Enter temperature in *C: ");
    C = sc.nextFloat();

    // F = 32 + (9 / 5) * C; 
    F = 32 + (9f / 5f) * C;
    System.out.println("Temperature in fahrenheit: " + F);
  }
}
