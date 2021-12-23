package tacos;

public class Taco {
    private String shell;
    private String meat;
    private String queso;
    private String topping;
    private String salsa;

    public Taco(String shell, String meat, String queso, String topping, String salsa) {
        this.shell = shell;
        this.meat = meat;
        this.queso = queso;
        this.topping = topping;
        this.salsa = salsa;
    }

    public String getShell() {
        return shell;
    }

    public String setShell(String shell) {
        this.shell = shell;
        return shell;
    }

    public  String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public  String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public  String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
