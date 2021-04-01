import java.util.Scanner;

public class ProcessAName5026201055 {

    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = sken.nextLine();
        int Indx = name.indexOf(" ");
        String firstName = name.substring(0, Indx);
        String lastName = name.substring((Indx+1), name.length());

        System.out.println("Your name is: " + lastName + ", " + firstName.substring(0,1)); }}