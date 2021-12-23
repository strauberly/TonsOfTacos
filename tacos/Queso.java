package tacos;

import orders.TakeOrder;

public class Queso {
    private static String quesoSelection = null;
    private static String mix = "Fiesta Mix";
    private  static String fresco = "Queso Fresco";

    public Queso(String mix, String fresco) {
        Queso.mix = mix;
        Queso.fresco = fresco;
    }

    public static String selectQueso() {
        System.out.println("""
                
                Please choose a Queso.
                
                Press '1' for  Fiesta Mix.
                
                Press '2' for  Queso Fresco.
                """);
        TakeOrder.setSelection();
        switch (TakeOrder.getSelection()) {
            case 1 -> quesoSelection = mix;
            case 2 -> quesoSelection = fresco;
            default -> {
                System.out.println("""

                        Not a valid selection.
                        
                        """);
                selectQueso();
            }
        }
        return null;
    }

    public static String getQuesoSelection() {
        return quesoSelection;
    }

    public static String getMix() {
        return mix;
    }

    public static String getFresco() {
        return fresco;
    }
}
