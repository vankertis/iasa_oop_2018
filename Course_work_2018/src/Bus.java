//Class that describes a Bus

public class Bus extends AbstractVehicle implements Passengers_to_accom,Typology {

        public Bus(int year, String name, String color, int price) {
            super(year, name, color, price);
        }

        //Shows a message with type of a vehicle
        @Override
        public void display_type() {
            System.out.println("\nType of this vehicle: Bus");
        }

        //Shows a message with number of passengers the vehicle can accommodate
        @Override
        public void pass_num (int value) {
            System.out.println("Can accommodate: " + value + " passengers. In case it marshrutka in Kyiv it may accommodate: " + (value+30) + " passengers \n");
};

        //"Drive" method that shows a message, which describes how a particular vehicle drives
        @Override
        public void drive () {
            System.out.println("Drives normally, can handle a lot of passengers");
        }

    }

