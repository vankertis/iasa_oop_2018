//Class to work with all vehicle types
import java.util.Scanner;
import java.util.ArrayList;
public class Autopark {

    public static void main (String [] args) {
        boolean flag = true;

        //Create a list of "AbstractVehicle" type

        ArrayList<AbstractVehicle> l = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        //Starting a general loop
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

            //Choosing the type of a vehicle we want to add and making a loop to be sure a user write the right answer

            boolean typeChecker = true;
            int choice = 1;
            while (typeChecker) {
                System.out.println("Choose a type of a vehicle: 1 - regular car, 2 - track, 3 - bus, 4 - motobike");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    typeChecker = false;
                }
                else {
                    System.out.println("You need to write 1, 2, 3 or 4. Please, try again!");
                }
            }

            //Creation and adding a new vehicle to the list

            VehicleFactory vehFactory = new VehicleFactory();
            l.add(vehFactory.getVehicle(choice, year, name, color, price));

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
