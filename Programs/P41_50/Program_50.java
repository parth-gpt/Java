/** Program to pattern no. 32
 *   *
  * *
   *
  * *
 *   *      */

import java.util.Scanner;

public class Program_50{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)
		{
			for (int j= 1; j<= n; j++)
			{
                if (j == i || j == (n + 1) - i)
                {
                	System.out.print("*");
                }
                else
                {
                	System.out.print(" ");
                }
			}
			System.out.println();
		}
	}
}