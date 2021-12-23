package orders;

import drinks.Drink;
import sides.Side;
import tacos.GoldenPound;
import tacos.Pound;
import tacos.Topping;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

//

public class TakeOrder {
    private static int selection;
    private static double price = 0;
    private static double total = 0;


    static Scanner scanner = new Scanner(System.in);

    private static final List<Double> Total = new LinkedList<>();
    private static final List <String> Order = new ArrayList<>();

    private static boolean newOrder = true;



    // order verification needed. is this correct if no rm last item in order
    public static void takeOrder() {
        if (newOrder) {
            System.out.println("""
                           Hola, welcome to Tons of Tacos!
                                    
                    Make your selections and place an order, por favor.
                                    
                            Press '1' for individual items.
                                    
                                Press '2' for combos.
                    """);
        }else
            System.out.println("""                     
                        Press '1' for individual items.
                                
                            Press '2' for combos.
                """);

        setSelection();
        switch (getSelection()){
            case 1 -> orderItem();
            case 2 -> orderCombo();
        }
    }

    public static void addOrClose(){
        System.out.println("""
                                
                Would ustedes like to add to the order or close the order?
                                
                Press '1' to add to order.
                                
                Press '2' to close the order.
          """);
        setSelection();
        switch (getSelection()){
            case 1 -> {
                newOrder = false;
                takeOrder();
            }
            case 2 -> {
                newOrder = true;
                closeOrder();
            }
        }
    }

    public static void closeOrder(){
        double tax = .05;
        // gen a random number
        Random rnd = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);
        int random = rnd.nextInt(300);
        // set total
        Total.forEach(t -> total += (t));
        double lootersCut = tax * total;
        double grandTotal = lootersCut + total;
        System.out.println("Order # " + random);
        Order.forEach(o -> System.out.println(o + "\n"));
//        Order.forEach(System.out::println);
        System.out.println("Your total is = $" + total + "\n" +
                "Government Looters Cut = 5%" + "\n" +
                "Please take your receipt and pay cashier $" + df.format(grandTotal));

        // might be fun to randomize the following message
        System.out.println("""
                
                While enjoying the food we prepared please remember:
                
                1. Properly dispose of your waste if you can't use it.
                
                2. Humerous antecdote.
                
                Generic thank you.
                
                
                
                
                
                
                
                
                
                
                
                
                """);
        total = 0;
        price =0;
        Total.clear();
        Order.clear();
       takeOrder(); // uncomment out for fixed application or comment out for scrolling.
    }

    public static void orderQuarterCombo() {
            setPrice(4.00);
            Pound pound = new Pound();
             Drink.selectDrink();
             Side.selectSide();
            String drinkSelection = String.valueOf(Drink.getDrinkSelection());
            String drinkSizeSelection = String.valueOf(Drink.getSizeSelection());
            String sideSelection = String.valueOf(Side.getSideSelection());
            String combo = "1 X Quarter Ton Combo = $" + price + "\n" +
                    "[ " + pound + "\n" +
                    "  1 X " + drinkSelection + " - " + drinkSizeSelection + "\n" +
                    "  1 X " + sideSelection + " ]" + "\n";
            Order.add(combo);
            Total.add(price);
            System.out.println(combo);
            addOrClose();
        }

    public static void orderHalfCombo() {
        setPrice(8.50);
        String taco1 = String.valueOf(new GoldenPound());
        String taco2 = String.valueOf(new GoldenPound());
        Drink.selectDrink();
        Side.selectSide();
        String drinkSelection = String.valueOf(Drink.getDrinkSelection());
        String drinkSizeSelection = String.valueOf(Drink.getSizeSelection());
        String sideSelection = String.valueOf(Side.getSideSelection());
        String combo = "1 X Half Ton Combo = $" + price + "\n" +
                "[ " + taco1 + "\n" +
                "  " +taco2 + "\n" +
                "  1 X " + drinkSelection + " - " + drinkSizeSelection + "\n" +
                "  1 X " + sideSelection + " ]" + "\n";
        Order.add(combo);
        Total.add(price);
        System.out.println(combo);
        addOrClose();
    }

    public static void orderFullCombo() {
        setPrice(15.00);
        String taco1 = String.valueOf(new GoldenPound());
        String taco2 = String.valueOf(new GoldenPound());
        String taco3 = String.valueOf(new GoldenPound());
        String taco4 = String.valueOf(new GoldenPound());

        Drink.selectDrink();
        String drink1 = String.valueOf(Drink.getDrinkSelection());
        String drinkSizeSelection1 = String.valueOf(Drink.getSizeSelection());
        Drink.selectDrink();
        String drink2 = String.valueOf(Drink.getDrinkSelection());
        String drinkSizeSelection2 = String.valueOf(Drink.getSizeSelection());

        Side.selectSide();
        String sideSelection1 = String.valueOf(Side.getSideSelection());
        Side.selectSide();
        String sideSelection2 = String.valueOf(Side.getSideSelection());

        String combo = "1 X Half Ton Combo = $" + price + "\n" +
                "[ " + taco1 + "\n" +
                "  " +taco2 + "\n" +
                "  " +taco3 + "\n" +
                "  " +taco4 + "\n" +
                "  1 X " + drink1 + " - " + drinkSizeSelection1 + "\n" +
                "  1 X " + drink2 + " - " + drinkSizeSelection2 + "\n" +
                "  1 X " + sideSelection1 + " ]" + "\n" +
                "  1 X " + sideSelection2 + " ]" + "\n";
        Order.add(combo);
        Total.add(price);
        System.out.println(combo);
        addOrClose();
    }

    public static void orderItem() {
        System.out.println("""
                
                Please make a selection.
                
                Press '1' to order a Taco.
                                    
                Press '2' to order a Side.
                                    
                Press '3' to order a Drink.
                
                Press '4' to order a Topping.   
                """);
        TakeOrder.setSelection();
        switch (getSelection()) {
            case 1 -> orderTaco();
            case 2 -> orderSide();
            case 3 -> orderDrink();
            case 4 -> orderTopping();
        }
    }

    public static void orderCombo() {
        System.out.println("""
                                
                Please make a selection.
                                
                Press '1' to order a "1/4 Ton Combo".
                (1 X pound, 1 X side, 1 X drink)
                                
                Press '2' to order a "1/2 Ton Combo".
                (2 X  golden pounds, 1 X side, 1 X drink)
                                
                Press '3' to order a "Golden Ton Combo".
                (4 X pounds, 2 X sides, 2 X drinks)""");

        TakeOrder.setSelection();
        switch (getSelection()) {
            case 1 -> orderQuarterCombo();
            case 2 -> orderHalfCombo();
            case 3 -> orderFullCombo();
        }
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
       setPrice(5.30);
        System.out.println("""
                
                Please choose a Taco Shell, Meat, Queso, Salsa and three toppings.
                """);
        GoldenPound goldenPound = new GoldenPound();
        Order.add(String.valueOf(goldenPound));
        Total.add(price);
        System.out.println(goldenPound + " = $" + price);
        addOrClose();
//        order to receipt
        // add price to total
    }

    public static void orderPound(){
    Pound pound = new Pound();
    setPrice(2.25);
        Order.add(pound + " = $" + price);
        Total.add(price);
        System.out.println(pound +" = $" + price + "\n");
        addOrClose();
    }

    public static void orderSide(){
        Side.selectSide();
        Order.add("1 X " + Side.getSideSelection() + " = $" + Side.getSidePrice(Side.getSideSelection()));
        Total.add(Side.getSidePrice(Side.getSideSelection()));
        System.out.println("1 X " + Side.getSideSelection() + " = $" + Side.getSidePrice(Side.getSideSelection()));
        addOrClose();
    }

    public static void orderDrink(){
        Drink.selectDrink();

        String drinkSelection = String.valueOf(Drink.getDrinkSelection());
        String drinkSizeSelection = String.valueOf(Drink.getSizeSelection());
        String drinkPrice = String.valueOf(Drink.getDrinkPrice(Drink.getDrinkSelection()));

        Order.add("1 X " + drinkSelection + " - " + drinkSizeSelection + " = $" + drinkPrice );
        Total.add(Drink.getDrinkPrice(Drink.getDrinkSelection()));

        System.out.println("1 X " + drinkSelection + " - " + drinkSizeSelection + " = $" + drinkPrice);
        addOrClose();
    }

    public static void orderTopping(){
        Topping.selectTopping();
        Order.add("1 X " + Topping.getToppingSelection() + " = $" + Topping.getToppingPrice(Topping.getToppingSelection()));
        Total.add(Topping.getToppingPrice(Topping.getToppingSelection()));
        System.out.println("1 X " + Topping.getToppingSelection() + " = $" + Topping.getToppingPrice(Topping.getToppingSelection()));
        addOrClose();
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
