import java.util.Scanner;
class BirthMonth{
    public static void main() {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter your birth month (1-12): ");

        if(console.hasNextInt()){

            int month = console.nextInt();

            if (month >= 1 && month <= 12){
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }

        }
    }
}

// A program that asks the user to enter their birth month (integer 1 – 12 inclusive).
// If the user enters a value in range, the program echoes the input ("Your birth month is: N")
// If the value is not in the range it outputs an error msg ("You entered an incorrect month value: N").
// Here N should be the value they entered.