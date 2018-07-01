//Class that describes a regular car

public class Regular_car extends AbstractVehicle implements Passengers_to_accom,Typology {
    public Regular_car(int year, String name, String color, int price) {
        super(year, name, color, price);
    }

    //Shows a message with type of a vehicle
    @Override
    public void display_type() {
        System.out.println("\nType of this vehicle: Regular car");
    }

    //Shows a message with number of passengers the vehicle can accommodate
    @Override
    public void pass_num (int value) {
        System.out.println("Can accommodate: " + value + " pasengers \n");
    };


    //"Drive" method that shows a message, which describes how a particular vehicle drives
    public void drive () {
        System.out.println("Drives fast, can handle passengers and move some weight");
    }

    }

