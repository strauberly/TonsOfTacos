package sides;

import orders.TakeOrder;

public class Side {
    private static String sideSelection = null;
    private static double sidePrice = 0;
    private static final String corn = "Street Corn";
    private static final String pico = "Pico de Gallo";
    private static final String slaw = "Slaw de Mexico";
    private static final String papas = "Papas Fritas";
    private static final String rnb = "Rice and Beans";


    public Side() {
        Side.sideSelection = getSideSelection();
    }

    public static Object selectSide() {
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
        return null;
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
