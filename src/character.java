
/*Write a program that takes a character from the user as input and determines whether the
character entered is a capital letter, a small case letter, a digit or a special symbol and display
appropriately.
Input: A
Output: Capital letter*/

import java.util.Scanner;

public class character{
    public static void main(String args[]){
        char ch;
        System.out.println("enter a character");
        Scanner sc= new Scanner(System.in);
        ch=sc.next().charAt(0);
        if (ch>='a' && ch<='z')
            System.out.println("small case letter");
        else if (ch>='A'  && ch<='Z')
            System.out.println("capital letter");
        else if (ch>='0' && ch<='9')
            System.out.println("a digit");
        else
            System.out.println("special character");


    }
}