import java.util.Scanner;

/* 8. Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
        100) User should guess until the the target number is guessed correctly.
        Print separate messages for the following:
        a. Number guessed is more than original number
        b. Number guessed is less than original number
        c. Number guessed matches the original number */
public class guess{
    public static void main(String args[]){
        int target=15,get=0;
        System.out.println("enter number between 1-50");
        Scanner sc=new Scanner(System.in);
        while(get!=target) {
            get = sc.nextInt();
            if (get > target)
                System.out.println(" Number guessed is more than original number");
            else if (get < target)
                System.out.println(" Number guessed is less than original number");
            else if (get == target)
                System.out.println(" Number guessed is matches the original number");
        }


    }
}