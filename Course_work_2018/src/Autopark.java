//Class to work with all vehicle types
import java.util.Scanner;
import java.util.ArrayList;
public class Autopark {

    public static void main (String [] args) {
        boolean flag = true;

        //Create a list of "AbstractVehicle" type

        ArrayList<AbstractVehicle> l = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        //Starting a loop
        while (flag == true) {

            //Adding general data for a vehicle

            System.out.print("Enter vehicle name: ");
            String name = input.next();
            input.nextLine();
            System.out.println("Enter color of the vehicle: ");
            String color = input.next();
            System.out.println("Enter year of production:");
            int year = input.nextInt();
            System.out.println("Enter price of the vehicle:");
            int price = input.nextInt();

            //Choosing the type of a vehicle we want to add

            System.out.println("Choose a type of a vehicle: 1 - regular car, 2 - track, 3 - bus, 4 - motobike");
            int choice = input.nextInt();

            //Creating a new object

            if (choice == 1) {
                Regular_car veh = new Regular_car(year, name, color, price);
                //Adding information about the number of passengers this vehicle can accomodate
                System.out.println("How many passengers could this vehicle accommodate?");
                int pass_amount = input.nextInt();
                //Calls the method which is implemented by Passengers_to_accommodate interface and display a message about the number of passengers
                // it can accommodate, based on information added by a user
                veh.pass_num(pass_amount);
                l.add(veh);
            }
            else if (choice == 2) {
                Track_car veh = new Track_car(year, name, color, price);
                //Adding information about the tones this vehicle can handle
                System.out.println("How many tones can this track handle?");
                int weight_amount = input.nextInt();
                //Calls the method which is implemented by Move_weight interface and display a message about the tones
                // it can handle, based on information added by a user
                veh.weight(weight_amount);
                l.add(veh);
            }
            else if (choice == 3) {
                Bus veh = new Bus(year, name, color, price);
                //Adding information about the number of passengers this vehicle can accomodate
                System.out.println("How many passengers could this vehicle accommodate?");
                int pass_amount = input.nextInt();
                //Calls the method which is implemented by Passengers_to_accommodate interface and display a message about the number of passengers
                // it can accommodate, based on information added by a user
                veh.pass_num(pass_amount);
                l.add(veh);
            }
            else if (choice == 4) {
                Motobike veh = new Motobike(year, name, color, price);
                veh.wheels_num();
                l.add(veh);
            }
            else {
                System.out.println("You picked a number which is not in the system. Please, next time pick something from the list");
            }

            //Asking user for the next step: to show the vehicle list or to add more vehicles to it

            System.out.println("Do you want to finish and display all list of vehicles? 1 - yes, 2 and anything else - no, I want to add more vehicles");
            int new_choice = input.nextInt();

            //Display a list of vehicles and exit the loop

            if (new_choice == 1) {
            l.forEach(
                    a -> {
                        a.display_type();
                        System.out.println(a.general_info());
                        a.drive();
                    }
            );
            flag = false;}


        }
    }
}
