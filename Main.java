import orders.TakeOrder;
//future implementation might include:
// items available by in stock(ie how many tacos/combos etc can be made, allow order only if in stock)
// transmitting order to a remote location running production application
//building a database for ease of adding, eliminating and changing menu items - relational database seems like it would make most sense
//creation of production application (receive orders, update stock, mark order ready for pick-up or delivery, notify customer?)
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TakeOrder order = new TakeOrder();
        order.takeOrder();
        while (TakeOrder.isClosedOrder()) {
            order.takeOrder();
        }
    }
}
