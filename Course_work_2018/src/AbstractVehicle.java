//Abstract class for Vehicle that includes year, name, color and price for it

public abstract class AbstractVehicle implements Typology {

    int year;
    String name;
    String color;
    int price;

    public AbstractVehicle (int year, String name, String color, int price) {
        this.year = year;
        this.name = name;
        this.color = color;
        this.price = price;
    }
    //Returns general information about the vehicle

    public String general_info() {
        return String.format("Year: %d, Name: %s, color: %s, price: %d dollars", this.year, this.name, this.color, this.price);
    }

    //Abstract method "drive"
    abstract public void drive ();

}
