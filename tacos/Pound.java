package tacos;

// creates a set taco item through inheritance
public class Pound extends Taco {
    private static final double price = 2.25;


    public Pound() {
        super(Shell.getHardShell(), Meat.getGroundBeef(), Queso.getMix(), Topping.getLettuce(),
                Salsa.getSalsaRoja());
    }

    //    private static String shellSelection;
//    private static String meatSelection;
//    private static String salsaSelection;
//    private static String quesoSelection;
//    private static String toppingSelection;
//    private static double price;
//
//        public Pound() {
//        Pound.shellSelection = selectShell();
//        Pound.meatSelection = selectMeat();
//        Pound.salsaSelection = selectSalsa();
//        Pound.quesoSelection = selectQueso();
//        Pound.toppingSelection = selectTopping();
//        setPrice(2.25);
//    }
//
//
//    public String selectShell() {
//            shellSelection = Shell.getHardShell();
//            return shellSelection;
//    }
//
//
//    public String selectMeat() {
//        meatSelection = Meat.getGroundBeef();
//        return meatSelection;
//    }
//
//
//    public String selectSalsa() {
//        salsaSelection = Salsa.getSalsaRoja();
//        return salsaSelection;
//    }
//
//
//    public String selectQueso() {
//        quesoSelection = Queso.getMix();
//            return quesoSelection;
//    }
//
//
//    public String selectTopping() {
//        toppingSelection = Topping.getLettuce();
//        return toppingSelection;
//    }
//
//
//    public void setPrice(double price) {
//    Pound.price = price;
//        }
//
    public static double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "1 X Pound = " + getShell() + ", " + getMeat() + ", " + getSalsa() + ", " +
                getQueso() + ", " + getTopping();
    }

//

}


