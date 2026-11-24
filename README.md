# Lesson 6 – Polymorphism and Abstraction

## Program 1: PolymorphismDemo.java

This program shows two ways a customer can pay: cash and an e-wallet. It prints a different instruction depending on the type of payment used.

### How polymorphism works in this program

`Payment` is the parent class. `CashPayment` and `EWalletPayment` are its child classes because they use `extends Payment`.

Both child classes override the `processPayment()` method with `@Override`. The cash class asks the customer to hand money to the cashier, while the e-wallet class asks the customer to scan a QR code.

In `main()`, a variable with the parent type `Payment` refers first to a `CashPayment` object and then to an `EWalletPayment` object. Calling `processPayment()` runs the version belonging to the actual object. This lets the same method call produce different results.

## Program 2: AbstractionDemo.java

This program represents a delivery service that can deliver packages using a motorcycle or a truck.

### How abstraction works in this program

`DeliveryService` is the abstract parent class. It contains the abstract method `deliverPackage()`, which has no method body. Each child class must provide its own delivery instructions.

`DeliveryService` also has the concrete method `showStatus()`. This method already has a body, so both delivery types can use the same status message.

`BikeDelivery` and `TruckDelivery` extend `DeliveryService` and implement `deliverPackage()` in their own ways. The main method creates objects of both child classes and calls their methods.

## Reflection Questions

### 1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Overriding allows each child class to respond in its own way when the same method is called. Without an override, the child uses the parent's version of the method. In this payment example, a child that does not override `processPayment()` would display the general payment message instead of its own payment instruction.

### 2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

An abstract class may contain methods that do not have instructions yet. Creating an object from it would mean using something that is not fully defined. The restriction makes sure that we create an object from a child class that supplies the missing behavior. The abstract class acts as a common guide for its child classes.

### 3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

I can create another class, such as `CardPayment`, that extends `Payment` and overrides `processPayment()`. I can then assign a `CardPayment` object to a `Payment` variable and call the same method. The program will run the card payment version without changing the existing payment classes.

### 4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes. An abstract class can define a common method that child classes must implement, and a parent-type variable can refer to objects of those child classes. For example, an abstract `DeliveryService` could require `deliverPackage()`. `BikeDelivery` and `TruckDelivery` could implement it differently. A `DeliveryService` variable could refer to either object, and calling `deliverPackage()` would run the correct version for that object.

### 5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

I would use polymorphism when several related objects need to respond differently to the same method call. It helps me write code that can work with different object types without checking each type repeatedly. I would use abstraction when I want to set common rules for a group of related classes while hiding details that do not need to be exposed. For example, a payment system can use a common payment type while each payment option handles its own process.

## How to Compile and Run

Open a terminal inside this folder and run:

```bash
javac PolymorphismDemo.java
java PolymorphismDemo

javac AbstractionDemo.java
java AbstractionDemo
```

## Expected Output

### PolymorphismDemo.java

```text
Cash payment: Please hand the money to the cashier.
E-wallet payment: Scan the QR code to complete the payment.
```

### AbstractionDemo.java

```text
Your package is being prepared for delivery.
Bike delivery: A rider will bring the package by motorcycle.

Your package is being prepared for delivery.
Truck delivery: The package will be transported by delivery truck.
```
