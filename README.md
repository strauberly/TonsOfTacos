# Tons of Tacos

This application is developed by Adam Straub 2021 - current, and is intended as a demonstration of programming ability in Java for consideration by recruiters and future employers.

If you have any questions about the project, have an employment opportunity, or know of any; I would love to hear from you! Please use superduper.tacos@manyme.com for correspondence. Cheers!

---

---

## Table of Contents

1. General Information
2. Technologies Used
3. Setup
4. Package and Class Descriptions
5. Future Implementations

---

---

# I. General Information

I was thinking of what projects I would like to build for a portfolio when I was thinking to myself "Would be kind of cool if while I wasn't working, but a buddy was, and if they were hungry, they could just send me a taco order through the command line and I could bring them lunch". That is how this project began.

TonsOfTacos is designed as an ordering system (client interface) for a fictional taco shop. It is meant to have a means for a customer to build an order, get a receipt of the items chosen, their itemized costs, and a grand total.

Further implementations and development will be notated in the DEV-JOURNAL.md file as well as summarized at the end of this README.

---

---

# II. Technologies Used

- java 17.0.1
- intellij

---

---

# III. Setup

Application should function out of the box from the command line or a properly configured IDE provided the system utilizes an appropriate JRE. The program does make use of lambdas and as such java 11 or greater is required.

---

---

# IV. Package and Class Descriptions

Please note further documentation and notes may possibly be found in the code.

---

## Package SRC:

Contains the following:

| Package/Class          | Description                                                                                                                                                                                                                                                                                  |
| ---------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Class: &nbsp; Main     | Launches our main args comprised of creating a new TakeOrder class, calling the takeOrder() method from TakeOrder class, and while our 'order is closed' flag is true (found in TakeOrder class), take an order. Essentially take an order and when the order is closed, take another order. |
| Package: &nbsp; tacos  | Contains all classes for creating tacos.                                                                                                                                                                                                                                                     |
| Package: &nbsp; sides  | Contains all classes for creating sides.                                                                                                                                                                                                                                                     |
| Package: &nbsp; drinks | Contains all classes for creating drinks.                                                                                                                                                                                                                                                    |
| Package: &nbsp; orders | Contains all classes for creating orders.                                                                                                                                                                                                                                                    |

---

## Package tacos:

Contains the following:

| Package/Class              | Description                                                                                                                                                                                                                                  |
| -------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Class: &nbsp; ANSIArt      | Contains printTaco() method. This method creates our taco artwork and greeting displayed before taking an order.                                                                                                                             |
| Class: &nbsp; GoldenPound  | Implements our taco builder interface (ITacoBuilder). Contains our constructor for a golden taco, and methods to get the users inputs for options pertaining to creation of a 'Golden Pound' taco, and return all as a string for display.   |
| Class: &nbsp; ITacoBuilder | This is our interface for building a custom taco such as the 'Golden Taco' based on the users selections.                                                                                                                                    |
| Class: &nbsp; Meat         | Contains a constructor and method for selecting meat choice as well as getter methods for use in other classes such as 'Pound'.                                                                                                              |
| Class: &nbsp; Pound        | Inherits from the Taco class to create a set type of taco through a constructor and a method that returns its traits as a string.                                                                                                            |
| Class: &nbsp; Queso        | Contains a constructor and method for selecting queso choice as well as getter methods for use in other classes such as 'Pound'.                                                                                                             |
| Class: &nbsp; Salsa        | Contains a constructor and method for selecting salsa choice as well as getter methods for use in other classes such as 'Pound'.                                                                                                             |
| Class: &nbsp; Shell        | Contains a constructor and method for selecting taco shell choice as well as getter methods for use in other classes such as 'Pound'.                                                                                                        |
| Class: &nbsp; Taco         | Contains a constructor for creating a taco object as well as getter and setter methods.                                                                                                                                                      |
| Class: &nbsp; Topping      | Contains a constructor and method for selecting topping choice as well as getter methods for use in other classes such as 'Pound'. There is also a method for getting a topping price as toppings can also be ordered as an individual item. |

---

## Package sides:

Contains the following:

| Package/Class      | Description                                                                                             |
| ------------------ | ------------------------------------------------------------------------------------------------------- |
| Class: &nbsp; Side | Contains constructor and methods for making a side selection and returning the selection and its price. |

---

## Package orders:

Contains the following:

| Package/Class           | Description                                                                                                                                                                                                                                                                                                                                    |
| ----------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Class: &nbsp; TakeOrder | Contains methods pertaining to multiple implementations of order including but not limited to: Creating a new order, adding individual items or combos to an order, adding to an existing order, closing the order and providing a receipt. This class also contains a flags for determining a new order and whether an order has been closed. |

---

## Package drinks:

Contains the following:

| Package/Class       | Description                                                                                                         |
| ------------------- | ------------------------------------------------------------------------------------------------------------------- |
| Class: &nbsp; Drink | Contains constructor and methods for making a drink selection, a size selection, and returning the selection price. |

---

---

# V. Future Implementations

At this point what I would like to include in the future is:

- Refine current solutions to include dynamic loading of options and selection feedback to customer.
- Include functionality of transmitting an order, instructions for pick up or delivery, and eventually include payment options.
- Possible creation of a subscription service.
- Develop a back of house application for storing menu items in relational database with CRUD operations for maintaining menu.
- View open orders and mark them when complete with possible option to contact customer with notification order ready for pick up or arriving soon.
- Tracking sales and transactions to be used for accounting purposes.
- Inventory with provider and cost tracking.

---

## Thank you for checking out this project and please feel free to contact me with any questions, cheers!

-Adam
