package Assignment;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

 
public class FileExists {
	
  public static void main(String[] path){
 
    Path filePath= Paths.get("FileExist.txt");
    boolean fileExists= Files.exists(filePath);
    
    if (fileExists == true) {
    	
    	System.out.println("File ‘FileExist.txt’ exists");
    	
	} else {
		
		System.out.println("File ‘FileExist.txt’ doesn't exist");

	}  
  }
}

