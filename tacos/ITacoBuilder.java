package tacos;
import orders.TakeOrder;
import static tacos.Shell.getShellSelection;
import static tacos.Meat.getMeatSelection;
import static tacos.Topping.setToppingSelection;
import static tacos.Salsa.getSalsaSelection;
import static tacos.Queso.getQuesoSelection;

public interface ITacoBuilder {

    static String selectShell() {
        Shell.selectShell();
        return getShellSelection();
    }
    static String selectMeat(){
        Meat.selectMeat();
        return getMeatSelection();
    }
     static String selectSalsa(){
        Salsa.selectSalsa();
        return getSalsaSelection();
     }
     static String selectQueso(){
        Queso.selectQueso();
        return getQuesoSelection();
     }
     static String selectTopping(){
         Topping.selectTopping();
         return setToppingSelection();
     }

    static double setPrice(double price) {
        TakeOrder.setPrice(price);
        return price;
    }
}
