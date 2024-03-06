package com.jetbrain;
import java.util.Scanner; //Importing scanner class
public class Main {

    public static void main(String[] args) {
        Scanner user= new Scanner(System.in); //Making a new scanner

        //Name
        String name; //Initializing the variable
        System.out.println("Please enter your name.");
        name = user.nextLine(); //Pass name to the reader
        System.out.println("Thank you "+name+" for entering your name."); //printing name and message

        //Age
        int age;
        System.out.println("Please enter your age.");
        age = user.nextInt();
        System.out.println("Thank you. Your age is "+age);

        //Confirm
        String confirm;
        System.out.println("Please verify this information by typing either 'Correct' or 'Incorrect'");
        confirm = user.next();

        if (confirm.equals("Correct")) {
            System.out.println("Name: "+ name + ", Age: "+ age);
        }
        else
        {
            System.out.print("Please restart the program and try again");
        }
    }
}
