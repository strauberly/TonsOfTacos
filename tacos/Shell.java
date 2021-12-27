package tacos;

import orders.TakeOrder;


    public class Shell {
    private static String shellSelection = null;

    private static String hardShell = "Hard Shell";
    private static String softShell = "Soft Shell";
    private static String friedShell = "Fried Shell";

    private Shell(String hardShell, String softShell, String friedShell) {
        Shell.hardShell = hardShell;
        Shell.softShell = softShell;
        Shell.friedShell = friedShell;
    }

    public static void selectShell() {
        System.out.println("""
                
                Please choose a Taco Shell.
                
                Select '1' for a Hard Shell.
                
                Select '2' for a Soft Shell.
                
                Select '3' for a Fried Shell.
                """);
        TakeOrder.setSelection();
        switch (TakeOrder.getSelection()) {
            case 1 -> shellSelection = hardShell;
            case 2 -> shellSelection = softShell;
            case 3 -> shellSelection = friedShell;
            default -> {
                System.out.println("""

                        Not a valid selection.
                        
                        """);
                selectShell();
            }
        }
    }

    public static String getShellSelection() {
        return shellSelection;
    }

    public static String getHardShell() {
        return hardShell;
    }

    public static String getSoftShell() {
        return softShell;
    }

    public static String getFriedShell() {
        return friedShell;
    }
}
