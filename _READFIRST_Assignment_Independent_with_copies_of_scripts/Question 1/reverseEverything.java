package Assignment;

import java.util.Scanner;

public class reverseEverything {
	public static void main(String[] s){
		
	String my_string="";	
	@SuppressWarnings("resource")
	Scanner input = new Scanner( System.in );
	System.out.print("add your input and press Enter: ");
	my_string = input.nextLine();
	
	String text = new StringBuffer(my_string).reverse().toString();
	System.out.println(text);
	}
    
}