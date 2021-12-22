package tacos;

// rewrite interface with methods from each class

public class GoldenPound implements ITacoBuilder{
    private static String shellSelection;
    private static String meatSelection;
    private static String salsaSelection;
    private static String quesoSelection;
    private static String toppingSelection;
    private static String toppingSelection2;
    private static String toppingSelection3;
    private static double price;

    public GoldenPound() {
        GoldenPound.shellSelection = getShellSelection();
        GoldenPound.meatSelection = getMeatSelection();
        GoldenPound.salsaSelection = getSalsaSelection();
        GoldenPound.quesoSelection = getQuesoSelection();
        GoldenPound.toppingSelection = getToppingSelection();
        GoldenPound.toppingSelection2 = getToppingSelection();
        GoldenPound.toppingSelection3 = getToppingSelection();
        GoldenPound.price = getPrice();
    }




//@Override
//
//public String
//
//    @Override
//    public String selectMeat() {
//        Meats.selectMeat();
//        return getMeatSelection();
//    }
//
//    @Override
//    public String selectSalsa() {
//        Salsa.selectSalsa();
//        return getSalsaSelection();
//    }
//
//    @Override
//    public String selectQueso() {
//        Queso.selectQueso();
//        return getQuesoSelection();
//    }
//
//    @Override
//    public String selectTopping() {
//        Toppings.selectTopping();
//        return getToppingSelection();
//    }

//    public String selectTopping2() {
//        T
//    }
//
//    public String selectTopping3() {
//        return null;
//    }

//    @Override
//    public String selectMeat() {
//        return null;
//    }

//    @Override
//    public String selectSalsa() {
//        return null;
//    }

//    @Override
//    public String selectQueso() {
//        return null;
//    }

//    @Override
//    public String selectTopping() {
//        return null;
//    }


    public static String getShellSelection() {
        return ITacoBuilder.selectShell();
    }

    public static String getMeatSelection() {
        return ITacoBuilder.selectMeat();
    }

    public static String getSalsaSelection() {
        return ITacoBuilder.selectSalsa();
    }

    public static String getQuesoSelection() {
        return ITacoBuilder.selectQueso();
    }

    public static String getToppingSelection() {
        return ITacoBuilder.selectTopping();
    }

//    public static String getToppingSelection2() {
//        return toppingSelection2;
//    }
//
//    public static String getToppingSelection3() {
//        return toppingSelection3;
//    }

    public static double getPrice() {
        return ITacoBuilder.setPrice(5.00);
    }

    public String toString() {
        return  "1 X Golden Pound = " + GoldenPound.shellSelection + ", " + GoldenPound.meatSelection + ", " +
                GoldenPound.salsaSelection + ", " + GoldenPound.quesoSelection +
                ", " + GoldenPound.toppingSelection + ", " +  GoldenPound.toppingSelection2 + ", "
                + GoldenPound.toppingSelection3 + " = " + GoldenPound.price;
    }

}
