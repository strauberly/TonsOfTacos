package tacos;
// Creates a taco through use of interface and allows
// Tons of Tacos to set the parameters and allows the user to select the details
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
//        GoldenPound.price = getPrice();
    }

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

    public static double getPrice() {
        return ITacoBuilder.setPrice(5.00);
    }

    public String toString() {
        return  "1 X Golden Pound = " + GoldenPound.shellSelection + ", " + GoldenPound.meatSelection + ", " +
                GoldenPound.salsaSelection + ", " + GoldenPound.quesoSelection +
                ", " + GoldenPound.toppingSelection + ", " +  GoldenPound.toppingSelection2 + ", "
                + GoldenPound.toppingSelection3;
    }

}
