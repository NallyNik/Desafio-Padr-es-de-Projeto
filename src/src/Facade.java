//Padrão de Projeto Facade

import java.util.Scanner;

public class Facade {  
    private static String choice;  
    public static void main(String args[]) {  
               
            System.out.print("========= Cake Flavor ============ \n");  
            System.out.print("            1. Vanilla              \n");  
            System.out.print("            2. Chocolate              \n");  
            System.out.print("Enter your choice: ");  
              
            Scanner scanner = new Scanner(System.in);
            choice = scanner.next();
            
            System.out.print("========= Topping ============ \n");  
            System.out.print("            1. Caramel              \n");  
            System.out.print("            2. Cream              \n");  
            System.out.print("            3. No Topping            \n");  
            System.out.print("Enter your choice: ");

            choice += scanner.next();

            CakeShop cakeshop = new CakeShop();  
              
            switch (choice) {  
            case "11":  
                {   
                  cakeshop.VanillaCaramelSale();  
                    }  
                break;  
            case "12":  
                {  
                  cakeshop.VanillaCreamSale();        
                    }  
                break;
            case "13":
                {
                cakeshop.VanillaNoTopping();
                }
                break;
            case "21":
                {
                    cakeshop.ChocolateCaramelSale();
                }
                break;
            case "22":
                {
                    cakeshop.ChocolateCreamSale();
                }
                break;
            case "23":    
                {
                    cakeshop.ChocolateNoTopping();
                }
                break;
            default:  
            {    
                System.out.println("Nothing purchased");  
            }         
                return;  
            }  
              
      }
}  