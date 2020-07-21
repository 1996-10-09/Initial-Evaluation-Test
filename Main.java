
import java.util.Scanner;



/**
 *
 * @author Oshadee Dasanayake
 */
public class Main {
    public static void main(String[]args){
        double value,x;
        int oneKG,twoKG,fourKG;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount of your order:");
        value= s.nextDouble();
        
        if(value>0.5 & value%1==0 || value%1==0.5){
            fourKG = (int) (value/4);
            x= value%4;
            twoKG= (int) (x/2);
            x= x%2;
            
            if(x==0.5){
                oneKG=1;
            }
            else{
                oneKG=(int) x;
            }
            
            System.out.println("4 KG Bags"+"\t"+fourKG+"\n"+"2 KG Bags:"+"\t"+twoKG+"\n"+"1 KG Bags:"+"\t"+oneKG);
        }
        else{
            System.out.println("Your order is rejected");
        }
        
    }
    
}
