import java.util.Scanner;
public class BoolExpressions {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int input = key.nextInt();

        if(input==3)
        {
            System.out.println("This is the first one.");
        }

        if(input==3)
        {
            System.out.println("This is the first one.");
        }
        else if(input==5)
        {
            System.out.println("This is the second one.");
        }
        else
        {
            System.out.println("You missed it.");
        }

    }

}
