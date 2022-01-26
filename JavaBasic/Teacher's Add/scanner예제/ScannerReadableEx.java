package feb04;

import java.io.*;
import java.util.*;
public class ScannerReadableEx {
	public static void main(String[] args) {
		Scanner scan = null;
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\io\\scan.txt");
			scan = new Scanner(fr);
			/*while (scan.hasNextDouble()) {
			System.out.printf("½ºÄµ  : %.2f %n" ,
					scan.nextDouble());
		    }*/
		    while (scan.hasNext()) {
			    System.out.printf("½ºÄµ  : %s %n" ,
					scan.next());
		    }
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fr != null)	fr.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			if (scan != null) scan.close();
		}
	}
}
