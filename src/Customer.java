
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Customer extends User  {

public void viewproduct () throws FileNotFoundException, IOException
{
    File file = new File("C:\\Users\\User\\Desktop\\SWEProject\\Aproducts.txt"); 
  
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
  String st; 
  while ((st = br.readLine()) != null) 
    System.out.println(st); 
    }
 
 
 public void viewStore() throws FileNotFoundException, IOException{
       File file = new File("C:\\Users\\User\\Desktop\\SWEProject\\Sproducts.txt"); 
  
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
  String st; 
  while ((st = br.readLine()) != null) 
    System.out.println(st); 
    }
}

    
    

