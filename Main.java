import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter time in minutes : ");
		int min = scan.nextInt();
		
		int revolutionTime = min * 3000;
		System.out.println("There are " + revolutionTime +" revolution per minute.");
		
		int sec = revolutionTime / 60;
		System.out.println("\nIt rotates " + sec + " degrees in one second" );
	}

}

