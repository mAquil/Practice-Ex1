import java.util.Scanner;
/*2. Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30 */
public class two{
    public static void main(String args[]){
        int num,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number between 20 and 30");
        num=sc.nextInt();
        i=num%2;
        if (i==0)
            System.out.println("Jerry");
        else
            System.out.println("Tom");
    }
}