This application,TonsOfTacos is intended as a demonstration of programming ability in Java for consideration by recruiters and future employers.

This is the journal of this application's development.

I intend for it to be accompanied by a technical README as well as videos.

Thank you for reading this and please feel free to contact me at superduper.tacos@manyme.com. Cheers!

---

---

-- 2021 Feb 5 --

README.md created and included.

---

-- 2021 Dec 23 --

\*\* formatted order confirmations

\*\* implemented methods for orders being totaled and displayed

\*\*implemented methods for ordering combos

\*\* application is set for scrolling at time being but would like console to scroll and run again

\*\* It lives! Operating mostly as intended. Will take a look again after Christmas and do some more fine tuning.

\*\* save and upload to git

# Merry Christmas! Happy New Year!

---

-application closes and restarts?

- potential size of classes and data will most likely migrate to db
  or map

- possibly move order methods to corresponding classes and reduce clutter in TakeOrder Class

- possibly implement a discount for bringing your own drink container

- check accessors

- decide if application terminates after submitting ordering or rolls to the next

- method to start over

- application closes and restarts- restructure build taco Interface >> evaluate using something similar but most likely utilize creating a combo class and extend it.

- asses means to clean up order class
  objects stored in a collection and selection number from scanner is used as a key to call the order item?

---

WORKING THROUGH COMBOS

> but a combo itself is an array of ordered items

so if pound ordered price == x

if combo ordered price = y

write x to an array and write y to an array

if a certain combo is ordered we want the combo name set, the individual elements ordered and stored into an array in the combo

the combo name is set in the order array and the price is set and added to the total array

print the combo
print the elements in the combo
print the price of the combo

total prints the total of whole order

## method for determine price of item

combo flag false
case 1
individual item ordered > item to items array

> price to total array > print item and price

done ordering
print each item next to corresponding price

print total

case 2
combo flag true

name of combo to item array,

price of combo to total array

> > build input validation

> > create method to clear order - option 0 for each selection intersection

> > find out how to change text color

---

combo development

        public static void orderQuarterCombo() {
            // instead of printing out to 2 separate lists we just bundle the info and send to receipt
            setPrice(4.00);
            Pound pound = new Pound();
             Drink.selectDrink();
             Side.selectSide();
            String drinkSelection = String.valueOf(Drink.getDrinkSelection());
            String drinkSizeSelection = String.valueOf(Drink.getSizeSelection());
            String sideSelection = String.valueOf(Side.getSideSelection());
            String combo = "1 X Quarter Ton Combo = $" + price + "\n" +
                    "[ " + pound + "\n" +
                    "  1 X " + drinkSelection + " - " + drinkSizeSelection + "\n" +
                    "  1 X " + sideSelection + " ]" + "\n";

// String comboDetails = pound + "\n" +
// drinkSelection + "\n" + sideSelection;

// itemList.add(Combo);
// priceList.add(price);
// comboDetailsList.add(comboDetails);
// System.out.println(pound);
// System.out.println(drinkSelection);
// System.out.println(sideSelection);
// System.out.println(qCombo);
// System.out.println(comboDetails);
// System.out.println(priceList);
// System.out.println(itemList);
// System.out.println(comboDetailsList);
//sout combo details
Orders.add(combo);
// System.out.println(combo);
Orders.forEach(System.out::println);
}

---

-- 2021 Dec 22 --

\*\* attempted to create repo but service down at moment, continuing development

\*\* repo created

\*\* itemized prices and methods set

\*\* extended pound from taco and cleaned up several lines of code

\*\* began sorting through combo logic

---

- restructure build taco Interface >> evaluate using something similar but most likely utilize creating a combo class and extend it.

---

or simply build a method that orders corresponding items by combo name and

case 1 combo name ==
order the following > this could be an individual method called from combo class

case 2 combo name ==
order the following

case 3 combo name ==
order the following

---

- A combo gets at minimum a taco a side and a drink each combo

> but a combo itself is an array of ordered items

so if pound ordered price == x

if combo ordered price = y

write x to an array and write y to an array

if a certain combo is ordered we want the combo name set, the individual elements ordered and stored into an array in the combo

the combo name is set in the order array and the price is set and added to the total array

print the combo
print the elements in the combo
print the price of the combo

total prints the total of whole order

## method for determine price of item

combo flag false
case 1
individual item ordered > item to items array

> price to total array > print item and price

done ordering
print each item next to corresponding price

print total

case 2
combo flag true

name of combo to item array,

price of combo to total array

items ordered for combo stored as a string into a combo items array

sort array for each item in items array and if == combo

combo count == +=

go to corresponding location in combo items array
items ordered for combo stored as a string into a combo items array

## set string of combo items to linked list

| combo count | combo details | item | price |
| 1 | combo1 | combo | combo price |
| 2 | combo 2 | taco | taco price |
| | | taco | taco price |
| | | combo | combo price |
| | | | |

if isCombo == false
item to item list
price to pice list

sout item plus price

if isCombo == true
combo to item list
price to price list
combo items stored to be printed as part of receipt later as string in combo details list
linking multiple arrays

list priceList <double> = linked list <>();

receipt
sort through item list and if item == combo >> combo count + 1 combo
price index == combo index

sout combo:
combo details of combo details index == combo count -1 +
price at combo index

combo items

go through item list if elementfound.equals combo

---

> > new combos extend combo

> > move to next type of taco

> > build input validation

> > create method to clear order - option 0 for each selection intersection

> > find out how to change text color

---

---

-- 2021 Dec 21 --

\*\* Restructured taco builder interface > found a different way to use it that is helpful

\*\* This could also be set up with sql and maps table for drinks, tacos, toppings etc. and then join tables for combo?

## \*\* Began work on ordering methods

> > create methods for ordering rest of items > create methods for ordering a combo which orders appropriate items

> > create method for printing receipts, creating order number and totals

> > combos > play with extending the class

> > build input validation

> > create method to clear order - option 0 for each selection intersection

> > find out how to change text color

> > set price for each item in its class and then just prices to total

> > receipt method

> > clear terminal after each block of code?

> > methods for adding item to menu or deleting item from menu

---

-- 2021 Dec 20 --

\*\* prices built as a method, check all items in array if element == whatever add price of x to total array?

## \*\* implemented selection means across classes and organised classes to corresponding packages.

> > restructure build taco Interface >> evaluate using something similar but most likely utilize creating a combo class and extending it.

> > move to next type of taco

> > combos

> > build input validation

> > create method to clear order - option 0 for each selection intersection

> > find out how to change text color

> > set price for each item in its class and then just prices to total

> > receipt method

> > clear terminal after each block of code?

---

-- 2021 Dec 19 --

## \*\* base classes built

> > application for taking orders

> > finish drinks

> > move to next type of taco

> > combos

> > build

//future development to include open port connection to order fulfillment application(select location, pickup or delivery, mark an order ready, mark an order filled) and sales (daily sales)

//User interface:
// what would you like to order
// select combo or individual items
// 1 = combo or 2 = items
// if combo select combo
//1 = 1/4, 2 = 3/4, 3 = taco ton
//// select tacos sides and drinks
// // any additional items or combos?
//1= y 2=n
// if y choose items or combo
// if n
//// print out order confirmation and number
//
//// after each item add item or combo?
////if y
////1=add item 2 = add combo
// if n
//// print out order confirmation and number
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
// 1 = horchata, 2 = coke, 3 = fanta 4 = iced tea
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
// 1/4 ton == 2 tacos 1 side 1 drink 1/2 ton == 2 tacos, 2 sides 1 drink Taco ton == 4 tacos, 2 sides 2 drinks
// pound is type of taco, is shell, meat, cheese, salsa, topping one, cost is
// pound of gold is type of taco, is shell, cheese, salsa, topping one, topping two, topping three
// hard, fried, and soft are of type shell
// cheddar and fresco are of type cheese
// ground beef, steak, green chile pork and grilled chicken are of type meat
// lettuce, cabbage, diced tomatoes, pickled jalapeĆ±o and onions, sour cream, avocado, and lime are toppings
// green, red, and christmas are of type salsa
// horchata is of type drink container bottle
// fanta is of type drink, orange, grape, pineapple, container bottle
// coke is of type drink, container bottle
// iced tea is of type drink, s, m, l, cup
// street corn, pico de gallo, mexican slaw, papas rice and beans are all of type sides
// order number == rng < 300
