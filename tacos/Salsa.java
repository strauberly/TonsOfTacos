package tacos;

import orders.TakeOrder;

public class Salsa {
    private static String salsaSelection = null;

    private static String salsaRoja = "Salsa Roja";
    private static String salsaVerde = "Salsa Verde";
    private static String christmas = "Christmas";

    public Salsa(String salsaRoja, String salsaVerde, String christmas ) {
        Salsa.salsaRoja = salsaRoja;
        Salsa.salsaVerde = salsaVerde;
        Salsa.christmas = christmas;
    }

    public static void selectSalsa() {
        System.out.println("""
                
                Please choose a Salsa.
                
                Press '1' for Salsa Roja.
                
                Press '2' for  Salsa Verde.
                
                Press '3' for Christmas.
                """);
        TakeOrder.setSelection();
        switch (TakeOrder.getSelection()) {
            case 1 -> salsaSelection = salsaRoja;
            case 2 -> salsaSelection = salsaVerde;
            case 3 -> salsaSelection = christmas;
            default -> {
                System.out.println("""

                        Not a valid selection.
                        
                        """);
                selectSalsa();
            }
        }
    }

    public static String getSalsaSelection() {
        return salsaSelection;
    }

    public static String getSalsaRoja() {
        return salsaRoja;
    }

    public static String getSalsaVerde() {
        return salsaVerde;
    }

    public static String getChristmas() {
        return christmas;
    }
}
