package sides;

import orders.TakeOrder;

public class Sides {
    private static String sideSelection = null;
    private static double sidePrice = 0;
    private static String corn = "Street Corn";
    private static String pico = "Pico de Gallo";
    private static String slaw = "Slaw de Mexico";
    private static String papas = "Papas Fritas";
    private static String rnb = "Rice and Beans";


    public Sides(String corn, String pico, String slaw, String papas, String rnb) {
        Sides.corn = corn;
        Sides.pico = pico;
        Sides.slaw = slaw;
        Sides.papas = papas;
        Sides.rnb = rnb;
    }

    public static void selectSide() {
        System.out.println("""
               
                Please choose a Side.
                
                Press '1' for  Street Corn.
                
                Press '2' for  Pico de Gallo.
                
                Press '3' for Slaw de Mexico.
                
                Press '4' for  Papas Fritas.
                
                Press '5' for Rice and Beans.
                """);

        TakeOrder.setSelection();
        switch (TakeOrder.getSelection()) {
            case 1 -> sideSelection = corn;
            case 2 -> sideSelection = pico;
            case 3 -> sideSelection = slaw;
            case 4 -> sideSelection = papas;
            case 5 -> sideSelection = rnb;
            default -> {
                System.out.println("""

                        Not a valid selection.
                        
                        """);
                selectSide();
            }
        }
    }

    public static String getSideSelection() {
        return sideSelection;
    }

    public static double getSidePrice(String sideSelection){
        if (sideSelection.equals(corn))
            sidePrice = 2.00;
        if (sideSelection.equals(pico))
            sidePrice = 1.50;
        if (sideSelection.equals(slaw))
            sidePrice = 1.00;
        if (sideSelection.equals(papas))
            sidePrice = 2.15;
        if (sideSelection.equals(rnb))
            sidePrice = 1.50;
        return sidePrice;
    }

    public static String getCorn() {
        return corn;
    }

    public static String getPico() {
        return pico;
    }

    public static String getSlaw() {
        return slaw;
    }

    public static String getPapas() {
        return papas;
    }

    public static String getRnb() {
        return rnb;
    }
}
