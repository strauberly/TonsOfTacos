package drinks;

import orders.TakeOrder;

public class Drink {
    private static String sizeSelection = null;
    private static String drinkSelection = null;
    private static double drinkPrice = 0;

    private static String horchata = "Horchata";
    private static String icedTea = "Iced Tea";
    private static String fantaO = "Orange Fanta";
    private static String fantaG = "Grape Fanta";
    private static String fantaP = "Pineapple Fanta";
    private static String cola = "Cola";


    public Drink(String horchata, String icedTea, String fantaO, String fantaG, String fantaP, String cola) {
        Drink.horchata = horchata;
        Drink.icedTea = icedTea;
        Drink.fantaO = fantaO;
        Drink.fantaG = fantaG;
        Drink.fantaP = fantaP;
        Drink.cola = cola;
    }

    public static Drink selectDrink() {
        System.out.println("""
                
                Please choose a Drink.
                
                Press '1' for  Horchata.
                
                Press '2' for  Iced Tea.
                
                Press '3' for  Orange Fanta.
                
                Press '4' for  Grape Fanta.
                   
                Press '5' for  Pineapple Fanta.
                
                Press '6' for  Cola.
                """);
        TakeOrder.setSelection();
        switch (TakeOrder.getSelection()) {
            case 1 -> {
                drinkSelection = horchata;
                selectSize();
            }
            case 2 -> {
                drinkSelection = icedTea;
                selectSize();
            }
            case 3 -> drinkSelection = fantaO;
            case 4 -> drinkSelection = fantaG;
            case 5 -> drinkSelection = fantaP;
            case 6 -> drinkSelection = cola;
            default -> {
                System.out.println("""

                        Not a valid selection.
                        
                        """);
                selectDrink();
            }
        }
        return null;
    }

    public static String getDrinkSelection() {
        return drinkSelection;
    }

    public static void selectSize() {
        System.out.println("""
                Please choose a Size.
                
                Press '1' for  Small.
                
                Press '2' for  Medium.
                
                Press '3' for  Large.
                """);
        TakeOrder.setSelection();
        String small = "Small";
        String large = "Large";
        String medium = "Medium";
        switch (TakeOrder.getSelection()) {
            case 1 -> sizeSelection = small;
            case 2 -> sizeSelection = medium;
            case 3 -> sizeSelection = large;
            default -> {
                System.out.println("""

                        Not a valid selection.
                        
                        """);
                selectSize();
            }
        }
    }



    public static String getSizeSelection() {
        if (sizeSelection == null){
            return "bottle";
        }
        return sizeSelection;
    }

    public static double getDrinkPrice(String drinkSelection){
        if (drinkSelection.equals(cola))
            drinkPrice = 1.00;
        if (drinkSelection.equals(fantaG) || drinkSelection.equals(fantaO) || drinkSelection.equals(fantaP))
            drinkPrice = 1.25;
        if (drinkSelection.equals(horchata) || drinkSelection.equals(icedTea) && getSizeSelection().equals("Small"))
            drinkPrice = 1.00;
        if (drinkSelection.equals(horchata) || drinkSelection.equals(icedTea) && getSizeSelection().equals("Medium"))
            drinkPrice = 1.50;
        if (drinkSelection.equals(horchata) || drinkSelection.equals(icedTea) && getSizeSelection().equals("Large"))
            drinkPrice = 2.00;
        return drinkPrice;
    }

    @Override
    public String toString() {
        return  "1 X " + getDrinkSelection() + " = $" + getDrinkPrice(getDrinkSelection());
    }

    public static String getHorchataS() {
        return horchata;
    }

    public static String getIcedTeaS() {
        return icedTea;
    }

    public static String getFantaO() {
        return fantaO;
    }

    public static String getFantaG() {
        return fantaG;
    }

    public static String getFantaP() {
        return fantaP;
    }

    public static String getCola() {
        return cola;
    }
}
