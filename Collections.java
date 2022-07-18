import java.util.Arrays;

public class Collections {
    public static void Ex1(){

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
    public static void main(String[] args)
    {
        Ex1();
    }
}
