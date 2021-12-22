package tacos;

public class Pound {
    private static String shellSelection;
    private static String meatSelection;
    private static String salsaSelection;
    private static String quesoSelection;
    private static String toppingSelection;
    private static double price;

        public Pound() {
        Pound.shellSelection = selectShell();
        Pound.meatSelection = selectMeat();
        Pound.salsaSelection = selectSalsa();
        Pound.quesoSelection = selectQueso();
        Pound.toppingSelection = selectTopping();
        setPrice(2.25);
    }


    public String selectShell() {
            shellSelection = Shells.getHardShell();
            return shellSelection;
    }


    public String selectMeat() {
        meatSelection = Meats.getGroundBeef();
        return meatSelection;
    }


    public String selectSalsa() {
        salsaSelection = Salsa.getSalsaRoja();
        return salsaSelection;
    }


    public String selectQueso() {
        quesoSelection = Queso.getMix();
            return quesoSelection;
    }


    public String selectTopping() {
        toppingSelection = Toppings.getLettuce();
        return toppingSelection;
    }


    public void setPrice(double price) {
    Pound.price = price;
        }

    @Override
    public String toString() {
        return  "1 X Pound = " + Pound.shellSelection + ", " + Pound.meatSelection + ", " + Pound.salsaSelection + ", " + Pound.quesoSelection +
                ", " + Pound.toppingSelection + " = " + getPrice();
    }

    public static double getPrice() {
        return price;
    }
}


