package tacos;

import orders.TakeOrder;

import static tacos.Shells.getShellSelection;
import static tacos.Meats.getMeatSelection;
import static tacos.Toppings.getToppingSelection;
import static tacos.Salsa.getSalsaSelection;
import static tacos.Queso.getQuesoSelection;

public interface ITacoBuilder {

    static String selectShell() {
        Shells.selectShell();
        return getShellSelection();
    }
    static String selectMeat(){
        Meats.selectMeat();
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
         Toppings.selectTopping();
         return getToppingSelection();
     }

    static double setPrice(double price) {
        TakeOrder.setPrice(price);
        return
     price;
    }
}
