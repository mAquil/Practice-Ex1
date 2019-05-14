import java.util.Scanner;
/*Write a program which accepts a number as input and check whether the given number is
palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions
Input : 2468642
Output : 2468642 is palindrome and the sum of even numbers is greater than 25
Input: 12345
Output: 12345 is not palindrome
Input: 12345654321
Output : 12345654321 is palindrome and sum of even numbers is less than 25 */

public class one {
    public static void main(String args[])
    {
        long num,rev=0,mod,add=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num= sc.nextLong();
        long i= num;
        while (i!=0){
            mod=i%10;
            if (mod%2==0){
                add=add+mod;
            }
            rev=(rev*10)+mod;
            i=i/10;

        }
        if (rev==num){
            if (add>25){
                System.out.println(num +" is palindrome and the sum of even numbers is greater than 25");
            }
            else {
                System.out.println(num + " is palindrome and sum of even numbers is less than 25");
            }
        }
            else{
                System.out.println(num + " is not palindrome");
            }

    }
}
