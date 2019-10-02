package AllLabs;

import java.util.Random;

public class SlotMachine {

    int cash;

    //Constructor
    public SlotMachine() {

        cash = 100;
    }

    public int getSpin() {

        //create random object and generate random numbers
        Random rand = new Random();
        return rand.nextInt(7) + 1;
    }

    //creating a print class the user will see
    public void printSpin(int num1, int num2, int num3) {
        System.out.println("+---+---+---+");
        System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");
        System.out.println("+---+---+---+");
    }

    //method to run 1000000 times

    public void million() {
        for (int i = 0; i <= 1000000; i++) {
            //run through 1000000 times without printing
            spinMil(1);

        }
    }

    //if statements for what happens when player wins
    public int getWin(int num1, int num2, int num3, int amount) {
        int total = 0;
        if (num1 == num2 && num1 == num3) {
            total = num1 * 5 * amount;
        } else if (num1 == num2) {
            total = num1 * amount;
        }
        return total;
    }

    //assigning random values to numbers and print it and subtracting bet amount
    public void spin(int amount) {

        cash -= amount;

        int num1 = getSpin();
        int num2 = getSpin();
        int num3 = getSpin();

        printSpin(num1, num2, num3);


        //calling getWin and adding winnings and cash
        int win = getWin(num1, num2, num3, amount);
        cash += win;

        System.out.println("You have won $" + win);
        System.out.println("You have a balance of $" + cash);

    }

    public void spinMil(int amount) {

        cash -= amount;
        int num1 = getSpin();
        int num2 = getSpin();
        int num3 = getSpin();


        int win = getWin(num1, num2, num3, amount);
        cash += win;
    }
}