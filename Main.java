
/**
 *
 * @author b21904343 
 * Yildirim Bayazit AKYUREK
 */

import java.text.ParseException;
import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) throws ParseException {
       
        FileIO input=new FileIO();  //IO class
        
        //inputFiletoArraylist method returns Arraylist
        ArrayList<String> priceArrayList=input.inputFiletoArraylist(args[1]); 
        ArrayList<String> shoppingArrayList=input.inputFiletoArraylist(args[0]);

        
        //Comparison and printing class
        Print print=new Print(priceArrayList, shoppingArrayList);
        


    }
}