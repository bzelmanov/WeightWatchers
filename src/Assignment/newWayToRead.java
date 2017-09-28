package Assignment;
import java.io.*;
import java.util.Scanner;

public class newWayToRead {
	
	public static void main(String args[]) throws IOException {
		
		Scanner file = new Scanner(new File("FileExist.txt"));
				
		while(file.hasNext()){
			
			String s = file.nextLine().trim().replace(" – ","\n").replace(", ","\n");
			
			System.out.println(s);
		}
		
	}	

}
