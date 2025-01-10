import java.util.Scanner;
public class Loops {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String input = key.nextLine();

        for(int i = 0; i < input.length(); i++)
        {
            System.out.println(input.charAt(i));
        }

        int randomNumber = (int)(Math.random()*10) + 1;

        while(randomNumber != 5)
        {
            System.out.println("That wasn't it, you got " + randomNumber);
            randomNumber = (int)(Math.random()*10) + 1;
        }

        while(true)
        {
            System.out.println("That wasn't it, you got " + randomNumber);
            randomNumber = (int)(Math.random()*10) + 1;
            if(randomNumber == 5)
            {
                break;
            }
        }
    }

}
