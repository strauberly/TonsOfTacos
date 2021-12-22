package tacos;

import orders.TakeOrder;

public class Toppings {
    private static String toppingSelection = null;
    private static String lettuce = "Lettuce";
    private static String cabbage = "Cabbage";
    private static String tomatoes = "Diced tomatoes";
    private static String pickledTopping = "Pickled Onions and Jalapeños";
    private static String sourCream = "Sour Creme";
    private static String avocado = "Avocado";
    private static String lime = "Lime";
    private static double toppingPrice;

    public Toppings(String lettuce, String cabbage, String tomatoes, String pickledTopping, String sourCream, String avocado, String lime) {
        Toppings.lettuce = lettuce;
        Toppings.cabbage = cabbage;
        Toppings.tomatoes = tomatoes;
        Toppings.pickledTopping = pickledTopping;
        Toppings.sourCream = sourCream;
        Toppings.avocado = avocado;
        Toppings.lime = lime;
        Toppings.toppingPrice = getToppingPrice();
    }

    public static void selectTopping() {
        System.out.println("""
                
                Please choose a Topping.
                
                Press '1' for  Lettuce.
                
                Press '2' for  Cabbage.
                
                Press '3' for Tomatoes.
                
                Press '4' for  Pickled Onions and Jalepeños.
                
                Press '5' for Sour Cream.
                
                Press '6' for Avocado.
                     
                Press '7' for  Lime.
                """);

        TakeOrder.setSelection();
        switch (TakeOrder.getSelection()) {
            case 1 -> toppingSelection = lettuce;
            case 2 -> toppingSelection = cabbage;
            case 3 -> toppingSelection = tomatoes;
            case 4 -> toppingSelection = pickledTopping;
            case 5 -> toppingSelection = sourCream;
            case 6 -> toppingSelection = avocado;
            case 7 -> toppingSelection = lime;
            default -> {
                System.out.println("""

                        Not a valid selection.
                        
                        """);
                selectTopping();
            }
        }
    }

    public static String getToppingSelection() {
        return toppingSelection;
    }

    public static double getToppingPrice(String drinkSelection){
        if (toppingSelection.equals(lettuce) || toppingSelection.equals(cabbage))
            toppingPrice = .50;
        if (toppingSelection.equals(tomatoes) || drinkSelection.equals(lime))
            toppingPrice = .75;
        if (toppingSelection.equals(horchata) || drinkSelection.equals(icedTea) && getSizeSelection().equals("Small"))
            toppingPrice = 1.00;
        if (toppingSelection.equals(horchata) || drinkSelection.equals(icedTea) && getSizeSelection().equals("Medium"))
            toppingPrice = 1.50;
        if (toppingSelection.equals(horchata) || drinkSelection.equals(icedTea) && getSizeSelection().equals("Large"))
            toppingPrice = 2.00;
        return toppingPrice;
    }

    public static String getLettuce() {
        return lettuce;
    }

    public static String getCabbage() {
        return cabbage;
    }

    public static String getTomatoes() {
        return tomatoes;
    }

    public static String getPickledTopping() {
        return pickledTopping;
    }

    public static String getSourCreme() {
        return sourCream;
    }

    public static String getAvocado() {
        return avocado;
    }

    public static String getLime() {
        return lime;
    }

    public static void setToppingPrice(double toppingPrice){
        Toppings.toppingPrice = toppingPrice;
    }

    public static double getToppingPrice(){
        return toppingPrice;
    }
}

