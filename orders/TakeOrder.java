package orders;

import drinks.Drinks;
import sides.Sides;
import tacos.GoldenPound;
import tacos.Pound;

import java.util.Scanner;

//

public class TakeOrder {
    private static int selection;
    private static double price = 0;

    static Scanner scanner = new Scanner(System.in);

    // order verification needed.
//    public TakeOrder() {
//       switch (getSelection()){
//           case 1 -> orderItem();
//           case 2 -> orderCombo();
//       }
//    }
    public static void orderItem() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("""
                Please press '1' to order a Taco.
                                    
                Please press '2' to order a Side.
                                    
                Please press '3' to order a Drink.
                                    
                            
                                    
                                    
                """);
        TakeOrder.setSelection();
        switch (getSelection()) {
            case 1 -> orderTaco();
            case 2 -> orderSide();
            case 3 -> orderDrink();
        }
//            case 4 -> orderTopping();

    }


    public static void orderTaco() {
        System.out.println("""
                
                Please select a Taco.
                
                Press '1' to order a Pound.
                                    
                Press '2' to order a Golden Pound.
                """);
        TakeOrder.setSelection();
        switch (getSelection()) {
            case 1 -> orderPound();
            case 2 -> orderGP();
        }
    }

    // order tacos

    public static void orderGP(){
        System.out.println("""
                
                Please choose a Taco Shell, Meat, Queso, Salsa and three toppings.
                """);
        GoldenPound goldenPound = new GoldenPound();
        System.out.println(goldenPound);
//        order to receipt
        // add price to total
    }

    public static void orderPound(){
        Pound pound = new Pound();
        System.out.println(pound);
        //        order to receipt
        // add price to total
    }

    //order sides
// have the print set up like taco
    public static void orderSide(){
        Sides.selectSide();
        System.out.println("1 X " + Sides.getSideSelection() + " = $" + Sides.getSidePrice(Sides.getSideSelection()));
    }

    public static void orderDrink(){
        Drinks.selectDrink();
        System.out.println("1 X " + Drinks.getDrinkSelection() + " = $" + Drinks.getDrinkPrice(Drinks.getDrinkSelection()));
    }

    public static int getSelection() {
        return selection;
    }

    public static void setSelection() {
        TakeOrder.selection = scanner.nextInt();
    }

    public static void setPrice (double price){
        TakeOrder.price = price;
    }
}
