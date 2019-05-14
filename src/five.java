
/*5. Write a program that reads an unspecified number of integer arguments using Scanner Class
and adds them together. The program should display total of the given input number and should
only consider integer value.The program should display an error message if there are any non
integer values
Input : 12 23 2 4
Output : 41 */

import java.util.Scanner;

public class five{
    public static void main(String args[]){
        int sum = 0,integer;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs you will give");
        int num=sc.nextInt();
        System.out.println("enter the integers");
        for (int i = 1; i <=num; i++) {
            integer=sc.nextInt();
            sum=sum+integer;
        }
        System.out.println("The sum of the integers is " + sum);
    }
}
