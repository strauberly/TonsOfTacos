
import orders.TakeOrder;
import tacos.*;
//future development to include open port connection to order fulfillment application and sales


//User interface:
// what would you like to order
// select combo or individual items
// 1 = combo or 2 = items
// if combo select combo
//1 = 1/4, 2 = 3/4, 3 = taco ton
//// select tacos sides and drinks
//        // any additional items or combos?
//1= y 2=n
//        if y choose items or combo
//        if n
////       print out order confirmation and number
//
//// after each item add item or combo?
////if y
////1=add item 2 = add combo
//        if n
////       print out order confirmation and number
//
//if items selected
//1= tacos 2=sides 3=drinks 4=additional toppings
//
//if tacos selected
//1 = pound 2 = pound of gold
//
//if sides selected
//
//1= street corn, 2= pico, 3=papas, 4 = rice and beans
//
//if drinks selected
//        1 = horchata, 2 = coke, 3 = fanta 4 = iced tea
//
//if fanta selected
//1=orange 2= grape 3= pineapple
//
//if iced tea =
//1=s 2=m 3=L






//possibly use maps here



// are all of these type item?


// User selects options and creates an order with a number and confirmation printout
// submitting an order without entering anything not allowed
// order has to have an item, an item is individual item(s) or combo(s)
// 1/4 ton 1/2 ton and taco ton are all types of combo
// 1/4 ton == 2 tacos 1 side 1 drink  1/2 ton == 2 tacos, 2 sides 1 drink   Taco ton == 4 tacos, 2 sides 2 drinks
// pound is type of taco, is shell, meat, cheese, salsa, topping one, cost is
// pound of gold is type of taco, is shell, cheese, salsa, topping one, topping two, topping three
// hard, fried, and soft are of type shell
// cheddar and fresco are of type cheese
// ground beef, steak, green chile pork and grilled chicken are of type meat
// lettuce, cabbage, diced tomatoes, pickled jalapeño and onions, sour cream,  avocado, and lime are toppings
// green, red, and christmas are of type salsa
// horchata is of type drink container bottle
// fanta is of type drink, orange, grape, pineapple, container bottle
// coke is of type drink, container bottle
// iced tea is of type drink, s, m, l, cup
// street corn, pico de gallo, mexican slaw, papas rice and beans are all of type sides
// order number == rng < 300
public class Main {
//    static Pound pound = new Pound();
//    static GoldenPound gp = new GoldenPound();
    public static void main(String[] args) {
        System.out.println("""
                       Hola, welcome to Tons of Tacos!
                                
                Make your selections and place an order, por favor.
                                
                        Press '1' for individual items.
                                
                            Press '2' for combos.
                """);

//
//        Shells.selectShell();
//        System.out.println("\n" + "You have chosen " + GoldenPound.getShellSelection() + "." + "\n" + "\n");
////        Meats.selectMeat();
//        System.out.println("\n" + "You have chosen " + GoldenPound.getMeatSelection() + "." + "\n" + "\n");
////        Toppings.selectTopping();
//        System.out.println("\n" + "You have chosen " + GoldenPound.getToppingSelection() + "." + "\n" + "\n");
////        Salsa.selectSalsa();
//        System.out.println("\n" + "You have chosen " + GoldenPound.getSalsaSelection() + "." + "\n" + "\n");
////        Queso.selectQueso();
//        System.out.println("\n" + "You have chosen " + GoldenPound.getQuesoSelection() + "." + "\n" + "\n");
//        Sides.selectSide();
//        System.out.println("\n" + "You have chosen " + Sides.getSideSelection() + "." + "\n" + "\n");
//        Drinks.selectDrink();
//        if (Drinks.getSizeSelection() != null) {
//            System.out.println("\n" + "You have chosen "+ Drinks.getSizeSelection() + " "  +
//                    Drinks.getDrinkSelection() + "." + "\n" + "\n");
//        }else
//            System.out.println("\n" + "You have chosen " + Drinks.getDrinkSelection() + "." + "\n" + "\n")
//        TakeOrder.orderGP();
//        System.out.println(gp.selectShell());
//        System.out.println(GoldenPound.getShellSelection());
//        System.out.println(pound);
//        System.out.println(gp);
//        System.out.println(GoldenPound.getShellSelection());
//        System.out.println(GoldenPound.getMeatSelection());
//        TakeOrder.orderGP();
//        TakeOrder.orderPound();
//        TakeOrder.orderSide();
//        TakeOrder.orderDrink();
        TakeOrder.orderItem();
    }
}
