import java.util.Scanner;

public class MinValue {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int[] numbers;
        int minValue;
        System.out.println("How many values?");
        numbers = new int[key.nextInt()];


        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter value " + (i+1));
            numbers[i] = key.nextInt();
        }
        minValue = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++)
        {
            if(numbers[i+1] < numbers[i])
            {
                minValue = numbers[i+1];
            }
        }

        System.out.println(minValue);

    }
}
