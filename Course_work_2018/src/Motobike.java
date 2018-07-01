//Class that describes a motobike

public class Motobike extends AbstractVehicle implements Typology, Wheels {


        public Motobike(int year, String name, String color, int price) {
            super(year, name, color, price);
        }

        //Shows a message with type of a vehicle
        @Override
        public void display_type() {
            System.out.println("\nType of this vehicle: Motobike");
        }

        //"Drive" method that shows a message, which describes how a particular vehicle drives
        public void drive () {
            System.out.println("Drives fast, but very dangerous \n");
        }


        @Override
        public void wheels_num() {

            System.out.println("Motobike has 2 wheels");
        }
}
