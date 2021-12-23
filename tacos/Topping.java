package tacos;

import orders.TakeOrder;

public class Topping {
    private static String toppingSelection = null;
    private static String lettuce = "Lettuce";
    private static String cabbage = "Cabbage";
    private static String tomatoes = "Diced tomatoes";
    private static String pickledTopping = "Pickled Onions and Jalapeños";
    private static String sourCream = "Sour Creme";
    private static String avocado = "Avocado";
    private static String lime = "Lime";
    private static double toppingPrice;

    public Topping(String lettuce, String cabbage, String tomatoes, String pickledTopping, String sourCream, String avocado, String lime) {
        Topping.lettuce = lettuce;
        Topping.cabbage = cabbage;
        Topping.tomatoes = tomatoes;
        Topping.pickledTopping = pickledTopping;
        Topping.sourCream = sourCream;
        Topping.avocado = avocado;
        Topping.lime = lime;
        Topping.toppingPrice = getToppingPrice();
    }

    public static String selectTopping() {
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
        return null;
    }

    public static String getToppingSelection() {
        return toppingSelection;
    }

    public static double getToppingPrice(String drinkSelection){
        if (toppingSelection.equals(lettuce) || toppingSelection.equals(cabbage))
            toppingPrice = .50;
        if (toppingSelection.equals(tomatoes))
            toppingPrice = .75;
        if (toppingSelection.equals(pickledTopping))
            toppingPrice = .25;
        if (toppingSelection.equals(sourCream) || toppingSelection.equals(avocado) ||  toppingSelection.equals(lime))
            toppingPrice = 1.50;
        return toppingPrice;
    }

    @Override
    public String toString() {
        return  "1 X " + getToppingSelection() + " = $" + getToppingPrice(getToppingSelection());
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
        Topping.toppingPrice = toppingPrice;
    }

    public static double getToppingPrice(){
        return toppingPrice;
    }
}

