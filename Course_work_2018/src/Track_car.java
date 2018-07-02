public class Track_car extends AbstractVehicle implements Move_weight,Typology {

    public Track_car(int year, String name, String color, int price) {
        super(year, name, color, price);
    }

    //Shows a message with type of a vehicle
    @Override
    public void display_type() {
        System.out.println("\nType of this vehicle: Track");
    }

    //"Weight" method that shows a message, which describes how much a track can handle
    @Override
    public void weight(int value) {
        System.out.println("Can move: " + value + " tones \n");
    }

    //"Drive" method that shows a message, which describes how a particular vehicle drives
    public void drive () {
        System.out.println("Drives slow, but handles a lot of weight");
    }

    ;
}

