package ie.atu.productv5;

import ie.atu.productv2.Book;
import ie.atu.productv2.BookDB;

import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to the Music Viewer");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter music code: ");
            String musicCode = sc.nextLine();  // read the music code

            // get the music object
            ie.atu.productv5.Music yourMusic = MusicDB.getMusic(MusicCode);

            // display the output
            System.out.println();
            if (yourMusic != null) {
                System.out.println("Description: " + yourMusic.toString());
                System.out.println("Price:       " + yourMusic.getPriceFormatted());
            } else {
                System.out.println("No music matches this book code.");
            }

            System.out.println();
            System.out.println("Music count: " + Music.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }


}
