import java.util.Scanner;
/* Create a program that accepts a word as input and checks for each single character letter in
        the word whether it is a consonant or vowel.
        Condition:
        a. Print an error message if the input is not a letter
        b. If the input having more than one letter, print the required output
        (Vowel or Consonant) for each letter
        Input : p
        Output : Consonant
        Input : ap
        Output : Vowel Consonant (should it be a - vowel, p - consonant)*/

public class three{
    public static void main(String args[]){
        String str;
        System.out.println("enter a word");
        Scanner sc= new Scanner(System.in);
        str= sc.nextLine();
        str=str.toLowerCase();

        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                System.out.print(ch + "-vowel ");
            } else if ((ch >= 'a' && ch <= 'z')) {
                System.out.print(ch + "-consonant ");
            } else {
                System.out.print(ch + " -error ");
            }
        }
    }
}