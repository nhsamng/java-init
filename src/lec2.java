import  java.util.Scanner; 
// import java.utils.*;

public class lec2
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Your fav numeber: ");
        if (userInput.hasNextInt())
        {
           int numberEntered = userInput.nextInt();
           // nextDouble()
           // nextFloat()
           // nextLine()
           System.out.println("You entered " + numberEntered);
           int numberEntered2Int = numberEntered + numberEntered;
           int numberEntered2Int_2 =+ 2;
           System.out.println(numberEntered + "+2=" + numberEntered2Int_2);
           System.out.println(numberEntered + "+" + numberEntered + "=" + numberEntered2Int);
           Float numberEnteredFloat = numberEntered + 0.5f;
           System.out.println("The number you entered has a surplus of 0.5: " + numberEnteredFloat);

        } else {
            System.out.println("Enter an interger next time");
        }
    }
}
// how to get the numberEntered2Int_2 = numberEntered2Int += 2 