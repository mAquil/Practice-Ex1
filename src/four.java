import java.util.Scanner;

/*Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
        6 6 . . . nth iteration.
        Input: 5
        Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5*/
public class four{

    public static void main(String args[]){
        int num;
        System.out.println("enter a single digit number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
        }

    }
}