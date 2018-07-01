import javax.swing.*;
import java.util.Scanner;

public class VehicleFactory {
    Scanner input = new Scanner(System.in);
    public AbstractVehicle getVehicle(int choice, int year, String name, String color, int price) {
        AbstractVehicle veh1 = null;

            if (choice == 1) {

                veh1 = new Regular_car (year, name, color, price);
                //Adding information about the number of passengers this vehicle can accommodate
                System.out.println("How many passengers could this vehicle accommodate?");
                int pass_amount = input.nextInt();
                //Calls the method which is implemented by Passengers_to_accommodate interface and displays a message about the number of passengers
                // it can accommodate, based on information added by a user
                ((Regular_car) veh1).pass_num(pass_amount);
                return veh1;
            }
            if (choice == 2) {

                veh1 = new Track_car(year, name, color, price);
                //Adding information about the tones this vehicle can handle
                System.out.println("How many tones can this track handle?");
                int weight_amount = input.nextInt();
                //Calls the method which is implemented by Move_weight interface and displays a message about the tones
                // it can handle, based on information added by a user
                ((Track_car) veh1).weight(weight_amount);
                return veh1;

            } else if (choice == 3) {

                veh1 = new Bus(year, name, color, price);
                //Adding information about the number of passengers this vehicle can accommodate
                System.out.println("How many passengers could this vehicle accommodate?");
                int pass_amount = input.nextInt();
                //Calls the method which is implemented by Passengers_to_accommodate interface and displays a message about the number of passengers
                // it can accommodate, based on information added by a user
                ((Bus) veh1).pass_num(pass_amount);
                return veh1;

            } else if (choice == 4) {

                veh1 = new Motobike(year, name, color, price);
                //Calls the method which is implemented by Wheels interface and displays a message about the number of wheels
                ((Motobike) veh1).wheels_num();
                return veh1;
            } else {
                System.out.println("You have to choose another number: from 1 to 4");
            }

        return null;
    };

}
