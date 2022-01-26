package feb04;

import java.util.*;
public class ScannerConsoleEx {
	public static void main(String[] args){
		
		System.out.print("ÀÔ·Â : ");
		
		Scanner scan = new Scanner(System.in);
		
		/*int number = scan.nextInt();
		System.out.printf("½ºÄµ : %d", number);
		scan.close();*/
		
		String number = scan.next();
		System.out.printf("½ºÄµ : %s", number);
		scan.close();
	}
}

















