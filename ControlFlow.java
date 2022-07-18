public class ControlFlow {
    public static void Factorial( int n )
    {
        //Factorial
        int i;
        int number=1;
        for(i=1;i<=n;i++)
        {
            number = number * i;
        }
        System.out.println("The factorial number " + n + "! is: " + number);
    }
    public static void Fibonacci ( int fibonacci )
    {
        //Fibonacci
        int a = 0,b = 1,d = 0, i;
        int c= b + a;
        for(i = 2;i<fibonacci;i++)
        {
            d= c + b;
            //System.out.println("d="+d);
            b = c;
            c = d;
        }
        System.out.println("The " + fibonacci + "th fibonacci number is: " + d);
    }

    public static void PrimeNumber( int nn )
    {
        //Prime number
        int NotPrime=0,i;
        for(i=2;i<=nn/2;i++)
        {
            if(nn%i==0) {
                NotPrime = 1;
                break;
            }
        }
        if(NotPrime==0)
        {
            System.out.println("The number " + nn + " is a prime number ");
        }
        else
        {
            System.out.println("The number " + nn + " is NOT a prime number ");
        }
    }

    public static void Palindrome( String Word )
    {
        //Palindrome
        int a=Word.length();
        char WordChar[]= new char[a];
        int counter=0,i;
        boolean notPalindrome = false;
        for (i=0;i<Word.length();i++)
        {
            WordChar[i] = Word.charAt(i);
        }
        for(i=(WordChar.length)-1;i>=(WordChar.length)/2;i--)
        {
            if(WordChar[counter]!=WordChar[i]) {
                notPalindrome = true;
                break;
            }
            counter++;
        }
        if(!notPalindrome)
        {
            System.out.println("The word " + Word + " is a palindrome");
        }
        else
        {
            System.out.println("The word " + Word + " is NOT a palindrome");
        }
    }
	public static void main(String[] args){
        	Factorial(3);
        	Fibonacci(13);
        	PrimeNumber(33);
        	Palindrome("LOVE");
}
}
