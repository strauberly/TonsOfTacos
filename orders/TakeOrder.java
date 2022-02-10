package orders;

import drinks.Drink;
import sides.Side;
import tacos.GoldenPound;
import tacos.Pound;
import tacos.Topping;
import tacos.ANSIArt;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

// selecting add to order closes order and need to clear arrays
public class TakeOrder {
    static Scanner scanner = new Scanner(System.in);
    private static int selection;
    private static double price = 0;
    private  double total = 0;
    private  static final List<Double> Total = new LinkedList<>();
    private   static final List <String> Order = new ArrayList<>();
    private  boolean newOrder = true;
    private static boolean closedOrder = false;



    public void takeOrder() throws InterruptedException {
        if (newOrder) {
            ANSIArt.printTaco();
            System.out.println( "\u001B[0m"+" ");
            System.out.println( ("\u001B[38;5;28m" + "Hola! Welcome") + ("\u001B[38;5;255m" + " to Tons") +
                    ("\u001B[38;5;124m"+ " of Tacos!") + "\n" + "\u001B[0m" + "\n" +
                    "Make your selections (number followed by enter) and place an order, por favor." + "\n" +
                    "\n" + "Select  '1'  for individual items. Select '2' for combos.");
        }else
            System.out.println("""                     
                        Select '1' for individual items.
                                
                            Select '2' for combos.
                """);

        setSelection();
        switch (getSelection()){
            case 1 -> orderItem();
            case 2 -> orderCombo();
            default -> {
                System.out.println("not a valid selection.");
                takeOrder();
            }
        }
    }

    private void addOrClose() throws InterruptedException {
        System.out.println("""
                                
                Would ustedes like to add to the order or close the order?
                                
                                Select '1' to add to order.
                                
                               Select '2' to close the order.             
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
            default -> {
                System.out.println("Not a valid selection.");
                addOrClose();
            }
        }
    }

    private void closeOrder() throws InterruptedException {
        double taxPercent = .05;
        // gen a random number
        Random rnd = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);
        int random = rnd.nextInt(300);
        // set total
        Total.forEach(t -> total += (t));
        double taxAmount = taxPercent * total;
        double grandTotal = taxAmount + total;
        
        System.out.println("\n" + "\n" +"\n" +"Order # " + random);
        Order.forEach(o -> System.out.println(o + "\n"));
        System.out.println("Your total is = $" + total + "\n" +
                "Tax = 5%" + "\n" +
                "Please take your receipt and pay cashier $" + df.format(grandTotal));

        // might be fun to randomize the following message
        System.out.println("""
                
                While enjoying the food we prepared please remember:
                
                1. Properly dispose of your waste if you can't use it.
                
                2. Humerous antecdote.
                
               A nice thank you message.
                """);
        price = 0;
        total = 0;
        Total.clear();
        Order.clear();
        closedOrder = true;
        Thread.sleep(15000);
        System.out.println("\u001b[2j");
    }

    private void orderQuarterCombo() throws InterruptedException {
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

    private void orderHalfCombo() throws InterruptedException {
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

    public  void orderFullCombo() throws InterruptedException {
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

        String combo = "1 X Full Ton Combo = $" + price + "\n" +
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

    public void orderItem() throws InterruptedException {
        System.out.println("""
                
                Please make a selection.
                
                Select '1' to order a Taco.
                                    
                Select '2' to order a Side.
                                    
                Select '3' to order a Drink.
                
                Select '4' to order a Topping.   
                """);
        TakeOrder.setSelection();
        switch (getSelection()) {
            case 1 -> orderTaco();
            case 2 -> orderSide();
            case 3 -> orderDrink();
            case 4 -> orderTopping();
            default -> {
                System.out.println("Not a valid selection.");
                orderItem();
            }
        }
    }

    public void orderCombo() throws InterruptedException {
        System.out.println("""
                                
                Please make a selection.
                                
                Select '1' to order a "1/4 Ton Combo".
                (1 X pound, 1 X side, 1 X drink)
                                
                Select '2' to order a "1/2 Ton Combo".
                (2 X  golden pounds, 1 X side, 1 X drink)
                                
                Select '3' to order a "Full Ton Combo".
                (4 X pounds, 2 X sides, 2 X drinks)""");

        TakeOrder.setSelection();
        switch (getSelection()) {
            case 1 -> orderQuarterCombo();
            case 2 -> orderHalfCombo();
            case 3 -> orderFullCombo();
            default -> {
                System.out.println("Not a valid selection.");
                orderCombo();
            }
        }
    }


    public  void orderTaco() throws InterruptedException {
        System.out.println("""
                
                Please select a Taco.
                
                Select '1' to order a Pound.
                                    
                Select '2' to order a Golden Pound.
                """);
        TakeOrder.setSelection();
        switch (getSelection()) {
            case 1 -> orderPound();
            case 2 -> orderGP();
            default -> {
                System.out.println("Not a valid selection.");
                orderTaco();
            }
        }
    }

    // order tacos

    public  void orderGP() throws InterruptedException {
       setPrice(5.30);
        System.out.println("""
                
                Please choose a Taco Shell, Meat, Queso, Salsa and three Toppings.
                """);
        GoldenPound goldenPound = new GoldenPound();
        Order.add(String.valueOf(goldenPound));
        Total.add(price);
        System.out.println(goldenPound);
        addOrClose();
//        order to receipt
        // add price to total
    }

    public  void orderPound() throws InterruptedException {
    Pound pound = new Pound();
    setPrice(2.25);
        Order.add(pound + " = $" + price);
        Total.add(price);
        System.out.println(pound +" = $" + price + "\n");
        addOrClose();
    }

    public  void orderSide() throws InterruptedException {
        Side.selectSide();
        Order.add("1 X " + Side.getSideSelection() + " = $" + Side.getSidePrice(Side.getSideSelection()));
        Total.add(Side.getSidePrice(Side.getSideSelection()));
        System.out.println("1 X " + Side.getSideSelection() + " = $" + Side.getSidePrice(Side.getSideSelection()));
        addOrClose();
    }

    public  void orderDrink() throws InterruptedException {
        Drink.selectDrink();

        String drinkSelection = String.valueOf(Drink.getDrinkSelection());
        String drinkSizeSelection = String.valueOf(Drink.getSizeSelection());
        String drinkPrice = String.valueOf(Drink.getDrinkPrice(Drink.getDrinkSelection()));

        Order.add("1 X " + drinkSelection + " - " + drinkSizeSelection + " = $" + drinkPrice );
        Total.add(Drink.getDrinkPrice(Drink.getDrinkSelection()));

        System.out.println("1 X " + drinkSelection + " - " + drinkSizeSelection + " = $" + drinkPrice);
        addOrClose();
    }

    public  void orderTopping() throws InterruptedException {
        Topping.selectTopping();
        Order.add("1 X " + Topping.setToppingSelection() + " = $" + Topping.getToppingPrice(Topping.setToppingSelection()));
        Total.add(Topping.getToppingPrice(Topping.setToppingSelection()));
        System.out.println("1 X " + Topping.setToppingSelection() + " = $" + Topping.getToppingPrice(Topping.setToppingSelection()));
        addOrClose();
    }

    public static int getSelection() {
        return selection;
    }

    public static void setSelection() {
        TakeOrder.selection = scanner.nextInt();
    }

    public static void setPrice(double price){
        TakeOrder.price = price;
    }

    public static boolean isClosedOrder() {
        return closedOrder;
    }
}
