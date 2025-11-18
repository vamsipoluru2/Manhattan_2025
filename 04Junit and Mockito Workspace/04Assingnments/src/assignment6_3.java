import java.util.Scanner;

public class assignment6_3 {
	public static void main(String[] args) {
//        Write a Java program to print the ASCII value of a given character.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch; // convert to ASCII
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
	}
}
