import java.util.Scanner;

/* 9. Write a program to reverse any string without using String Buffer.
Input : london
Output : nodnol  */
public class reverse{
    public static void main(String args[]){
        String str,reverse="";
        System.out.println("input a string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int len=str.length();
        for (int i=len-1; i>=0;i--){
            reverse=reverse+ str.charAt(i);
        }
        System.out.println(reverse);
    }
}