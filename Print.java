import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.ParseException;


public class Print {

    public Print(ArrayList<String> priceList,ArrayList<String>  shopping) throws ParseException{
        
    SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy"); //to compare shopping date and available priceList date.

        //Product Info from Arraylist to Array
        String [][] priceListLine= new String[priceList.size()][5]; //Price is ArrayList which is taken from priceList.txt file.
        int j=0;
        for(String k:priceList){
            String [] priceInfo=k.split("\t");
            priceListLine[j][0]=priceInfo[0]; //product
            priceListLine[j][1]=priceInfo[1]; //membership
            priceListLine[j][2]=priceInfo[2]; //date1
            priceListLine[j][3]=priceInfo[3]; //date2
            priceListLine[j][4]=priceInfo[4]; //price
            j++;
        }
        //to get each shopping transaction and compare it with the price list.
        for (String k : shopping) {
            //oneShopping shows the only shopping done that corresponds to one line
            String [] oneShopping=k.split("\t");
            System.out.println("---" + oneShopping[0] +"---"); //print customer name
            double total=0;
            for(int l=3;l<oneShopping.length;l+=2) // begin from column 4. The first three lines have customer name members and dates 
            {
                System.out.print(oneShopping[l]+"\t"); // to print product names
                //to compare shopping list and price list
                for (String[] priceColumn : priceListLine) 
                {
                    if (oneShopping[l].equals(priceColumn[0]) &&    //product name comparison
                            oneShopping[1].equals(priceColumn[1]) &&    //membership comparison
                            sdf.parse(priceColumn[2]).compareTo(sdf.parse(oneShopping[2])) <= 0 && //date comparison
                            sdf.parse(priceColumn[3]).compareTo(sdf.parse(oneShopping[2])) >= 0) 
                        
                    {   //4:price, (l+1):quantity
                        double subtotal = Double.parseDouble(priceColumn[4]) * Double.parseDouble(oneShopping[l+1]);
                        System.out.println(priceColumn[4] + "\t" + oneShopping[l+1] + "\t" + subtotal); 
                        total += subtotal;
                    }
                }
            }
            System.out.println("Total"+"\t" +total); //printing total
        }
    }
}
