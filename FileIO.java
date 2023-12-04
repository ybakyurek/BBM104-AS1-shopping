
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO {

    public ArrayList<String> inputFiletoArraylist (String inputFile) {
        
        ArrayList<String> inputArrayList=new ArrayList<>();
        
        try(Scanner scan=new Scanner(new FileReader(inputFile))){   
            
            while(scan.hasNextLine()){          //true will turn as long as there is a line
                inputArrayList.add(scan.nextLine());    //every line will be added to arraylist
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            
        }return inputArrayList;
    
    }
    
}
