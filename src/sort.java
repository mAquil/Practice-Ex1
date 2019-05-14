import java.util.Scanner;

/*Write a program which accepts a number as input from user and perform the following:
        a. sort the number in non-increasing order
        b. after sorting sum all the even numbers, the sum should be greater than 15 .
        c. if sum is more than 15,then print output as true or false.
        Input : 234534
        Output : Sorted number in non-increasing order : 544332

        Sum of even numbers : 10
        False*/
public class sort {
    public static void main(String args[]) {
        int num;
        int m,cnt=0,temp,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num = sc.nextInt();
        m=num;

        while (m != 0) {
            cnt++;
            m = m / 10;
            } /*count the number of digits*/
        int n=num;
        int arr[]=new int[cnt];
        int t=0;
        while (n!=0){
            arr[t]=n%10;
            n=n/10;
            t++;
        } /*storing the number in array */

        for (int i = 0; i < cnt; i++)
        {
            for (int j = i + 1; j < cnt; j++)
            {
                if (arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }   /*sorting */

        int num1=0,multiply=1;
        for (int l=cnt-1;l>=0;l--){
            num1=num1+(arr[l]*multiply);
            multiply=multiply*10;
        }  /*reversed number */

        System.out.println("Sorted number in non-increasing order :" +num1);

        for(int k=0;k<cnt;k++){
            if(arr[k]%2==0)
                sum=sum+arr[k];
        } /* sum of even numbers */
        System.out.println("Sum of even numbers : " +sum);
        if(sum>15)
            System.out.println("true");
        else
            System.out.println("false");



        }


}