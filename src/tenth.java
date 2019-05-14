import java.util.Scanner;

/* 10. Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
repeat n number of times in the output String.
Input1: Stackroute
Input2: 5
Output1: Stackrouterouterouterouterouteroute

Input1: Stackroute
Input2: 2
Output1: Stackroutetete */
public class tenth{
    public static void main(String args[]){
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        int len=input1.length();
        System.out.println("enter a number");
        int input2= sc.nextInt();
        int compare=len-input2;
        for(int i=1;i<=input2;i++){
            for (int j=compare; j<len; j++){
                input1=input1+ input1.charAt(j);
            }
        }
        System.out.println(input1);
    }
}