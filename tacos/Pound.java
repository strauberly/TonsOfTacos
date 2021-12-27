package tacos;

// creates a set taco item through inheritance
public class Pound extends Taco {

    public Pound() {
        super(Shell.getHardShell(), Meat.getGroundBeef(), Queso.getMix(), Topping.getLettuce(),
                Salsa.getSalsaRoja());
    }

    @Override
    public String toString() {
        return "1 X Pound = " + getShell() + ", " + getMeat() + ", " + getSalsa() + ", " +
                getQueso() + ", " + getTopping();
    }
}


