package ibf2021_day1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class shoppingcart {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String com = scan.next();
        
        List<String> cart =  new ArrayList<>();
        cart.add("apple"); cart.add("apple"); cart.add("orange");
        
        while (!com.startsWith("list") && 
               !com.startsWith("add")  && 
               !com.startsWith("delete")) {
           System.out.println("Please use only list or add.");
           com = scan.next();
        }
        if (com.equals("list"))
        System.out.println("List is " + cart);

        System.out.println(com);   
    }
}
