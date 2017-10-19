package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ManipulateDna {
  /** This program will display the completement to a strand of DNA.
  *
  */
  public static void main(String[] args) {

    /**This program will take a user input and show the DNA compltement to the input.
    *
    */

    // display the name of the programmer and the date
    System.out.println("Paul D. Sutkowski " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string \"" + dna + "\".");

    // Step Two: Compute the complement of the DNA String
    String m1 = dna.replace("a" , "T");
    String m2 = m1.replace("t" , "A");
    String m3 = m2.replace("g" , "C");
    String comp = m3.replace("c" , "G");
    dna = dna.toUpperCase();
    System.out.println("The complement of " + dna + " is " + comp + ".");
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random mut1 = new Random();
    int pos = mut1.nextInt(dna.length());
    char r1 = dna.charAt(mut1.nextInt(dna.length()));
    System.out.println("Random insertion : " + dna.substring(0, pos) + r1 + dna.substring(pos));
    
    
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    Random mut2 = new Random();
    int pos2 = mut2.nextInt(dna.length());
    String s1 = dna.substring(0, pos2);
    String s2 = dna.substring(pos2 + 1);
    System.out.println("Random deletion : " + s1 + s2);
    
  
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    Random mut3 = new Random();
    int pos3 = mut3.nextInt(dna.length());
    String s3 = dna.substring(0, pos3);
    String s4 = dna.substring(pos3 + 1);
    char r2 = dna.charAt(mut3.nextInt(dna.length()));
    System.out.println("Random substitution : " + s3 + r2 + s4);
    // Step Six: Display a final thankyou message
    System.out.println("Thank you for using this program!");
  }

}
