import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Collections {
    public static void Ex1(){

        //Generate 10 random numbers between 1 and 20,
        // which require that the random numbers cannot be repeated

        int count=0;
        int[] randomnumbers = new int[10];
        int i,j;
        boolean OK = true;
        int rand = (int)(Math.random()*20);
        randomnumbers[0] = rand;
        for(i=1;i<10;i++)
        {
            do
            {   OK= true;
                rand = (int)(Math.random()*20);
                for (j = 1; j <= i; j++)
                {
                    if(rand==randomnumbers[j-1])
                    {
                        OK = false;
                    }
                }
            } while (OK == false);

            randomnumbers[i] = rand;
        }
        System.out.println(Arrays.toString(randomnumbers));
    }
    
    public static void Ex2()
    {
        // Use Scanner to read a line of input from the keyboard, remove duplicate characters,
        // and print out different characters // print result + duplicates

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a line: ");
        String word = scanner.nextLine().trim();
        System.out.println("Inserted word: " + word);
        char[] wordedit = new char[word.length()];
        int i,j, a=word.length();
        for (i=0;i<a;i++)
        {
            wordedit[i] = word.charAt(i); // inserted the content of the read line into the array
        }
        //System.out.println("The word is: "+ Arrays.toString(wordedit)); // Checking if the array is correct
        boolean OK = true;
        System.out.print("The Word without duplicates: ");
        for(i=0;i<a;i++)
        {
            OK= true;
                for (j = 1; j <= i; j++)
                {
                    if(wordedit[i]==wordedit[j-1])
                    {
                        OK = false;
                    }
                }
            if(OK)
            {
                System.out.print(wordedit[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        Ex1();
        Ex2();
    }
}
