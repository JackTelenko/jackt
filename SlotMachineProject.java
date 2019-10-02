package AllLabs;

import java.util.Scanner;

public class SlotMachineProject {
    public static void main(String[] args) {
        //create scanner
        Scanner src = new Scanner(System.in);
        //create slot machine object
        SlotMachine slot = new SlotMachine();


        System.out.println("Welcome to FunTime.\n"
                + "You have $100 to start.\n"
                + "Enter -1 to cash out.\n");

        //making bet amount
        int amount = 1;


        //getting bet amount from user
        while (amount != -1) {

            System.out.println("Bet Amount: ");

            amount = src.nextInt();

            //user opting out of play
            if (amount == -1) {
                System.out.println("Thanks for playing! ending balance is $" + slot.cash);
                //after cash out it calls method to run 1000000 more times
                
                slot.million();
                System.out.println("Thanks for playing, after 1,000,000 more games you have $" + slot.cash);

            }

            //when user wants to play and spin the machine
            else {
                slot.spin(amount);
            }


        }
    }
}
