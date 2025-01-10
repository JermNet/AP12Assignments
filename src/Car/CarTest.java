package Car;

import java.util.Scanner;
public class CarTest {

    public static void main(String[] args) {

        boolean trueOrFalse = true;

        char letter = 'A';

        int number = (int)(Math.random()*10) + 1;

        double doubNum = 4.5;

        String myName = "Jeremy";

        Scanner key = new Scanner(System.in);

        String otherName = key.nextLine();

        System.out.println(otherName);

        Car car = new Car("Red", 1000);

        car.sayColour();

        number = car.getMileage();

        System.out.println(number);

    }

}
