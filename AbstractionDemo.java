// AbstractionDemo.java
abstract class DeliveryService {
    // Child classes must provide their own delivery procedure.
    public abstract void deliverPackage();

    // A regular method that is shared by all delivery services.
    public void showStatus() {
        System.out.println("Your package is being prepared for delivery.");
    }
}

class BikeDelivery extends DeliveryService {
    @Override
    public void deliverPackage() {
        System.out.println("Bike delivery: A rider will bring the package by motorcycle.");
    }
}

class TruckDelivery extends DeliveryService {
    @Override
    public void deliverPackage() {
        System.out.println("Truck delivery: The package will be transported by delivery truck.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        DeliveryService bike = new BikeDelivery();
        DeliveryService truck = new TruckDelivery();

        bike.showStatus();
        bike.deliverPackage();

        System.out.println();

        truck.showStatus();
        truck.deliverPackage();
    }
}
