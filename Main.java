/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Collatz
{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num = 0;
		int count = 0;
		
		System.out.print("Enter a positive number: ");
		num = scan.nextInt();
		
		while(num !=1){
		    if(num % 2==0){
		       num = num / 2; 
		       System.out.println("Current Given value is " + num);
		       count++;
		    }else{
		        num = 3 * num + 1;
		        System.out.println("Current Given value is " + num);
		        count++;
		    }
		}
	}
}
