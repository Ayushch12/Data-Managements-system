public class Stringmethods {
public static void main (String [] args){

    String name = "Billy Bob Joe";
    System.out.println("Name: " + name);

    // If we want to make a upperCase
    System.out.println("Uppercase: " + name.toUpperCase());

    //Lower case
    System.out.println("Lowercase: " + name.toLowerCase());


    //ChatAt case
    System.out.println("First char: " + name.charAt(2));

    //Lengths
    System.out.println("Length: " + name.length());

    // Char
    System.out.println("Last char: " + name.charAt(3));

    //Substring
    System.out.println("Substring: " + name.substring(10, 13));



}



}
