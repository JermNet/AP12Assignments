package Car;

public class Car {

    private String colour;
    private int mileage;

    public Car(String theColour, int theMileage)
    {
        colour = theColour;
        mileage = theMileage;
    }

    public Car(String theColour)
    {
        colour = theColour;
    }

    public void sayColour()
    {
        System.out.println(colour);
    }

    public int getMileage()
    {
        return mileage;
    }
}
