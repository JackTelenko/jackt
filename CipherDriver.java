package AllLabs;

import java.util.Scanner;

public class CipherDriver {
    public static void main(String[] args) {

        CaesarCipher cipher = new CaesarCipher();

        String ed;
        int key;

        //create scanner
        Scanner scnr = new Scanner(System.in);

        //get key
        System.out.println("Enter 3 digit key: ");
        key = scnr.nextInt();

        //print out key
        System.out.println("Your key is " + key);

        //creating string and asking if user wants to encrypt or decrypt
        System.out.println("Press E for encryption and D for decryption: ");
        ed = scnr.next();


        //tells program what to do depending on what user inputs
        if (ed.equals("e")) {
            //calls encrypt message and user input
            System.out.println("Enter message to encrypt: ");
            scnr.nextLine();
            String message = scnr.nextLine();
            System.out.println("Encoded message: " + cipher.encrypt(message,key));
            }

        if (ed.equals("d")) {
            //calls decrypt message and user input
            System.out.println("Enter message to decrypt: ");
            scnr.nextLine();
            String message = scnr.nextLine();
            System.out.println("Decoded message: " + cipher.decrypt(message,key));

                }
        scnr.close();

            }

        }

