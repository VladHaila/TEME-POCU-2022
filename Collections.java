import java.util.*;

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

    public static void Ex3()
    {
        // Remove duplicate elements in the collection
        // given a list of student, remove duplicates

        ArrayList<String> studentList = new ArrayList<>(Arrays.asList("Vlad","Ana","Maria","Ana","Vlad","Andrei"));
        System.out.println("\nStudent list is: " + studentList);
        ArrayList<String> noDuplicates = new ArrayList<>();
        int i,j;
        boolean OK;
        noDuplicates.add(studentList.get(0));
        for(i=1;i<studentList.size();i++) {
            OK = true;
            for (j = 1; j < i; j++)
            {
                if (studentList.get(i) == studentList.get(j - 1)) {
                    OK= false;
                    break;
                }
            }
            if(OK)
            {
                noDuplicates.add(studentList.get(i));
            }
        }
        System.out.println("Student list with no duplicates: " + noDuplicates);
    }

    public static void Ex4()
    {
        //Write a program to traverse(or iterate) HashSet
        HashSet<String> hash = new HashSet<String>(Arrays.asList("Vlad","Ana","Diana","Alex"));
        System.out.println("Iteration of HashSet: ");
        for (String i : hash)
        {
            System.out.print(i + "\t");
        }
    }

    public static void Ex5()
    {
        //Given an element write a program to check if element exists
        // in ArrayList, HashSet (eg. class Student with name,
        // grade and personalCode, given list of students check if the given student is present in the list)
        ArrayList<String> List = new ArrayList<String>(Arrays.asList("Lisa","Janet","Jane","Anna","Steve"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the name you want to find: ");
        String Name = scanner.nextLine().trim();
        boolean OK = false;
        int i;
        System.out.println(List);

        for(i=0;i<List.size();i++)
        {
            if (Name.equals(List.get(i)))
            {
                OK= true;
                System.out.println("The name " + Name + " has been found!");
                break;
            }
        }
        if(!OK)
        {
            System.out.println("The name " + Name + " couldn't be found.");
        }

    }

    public static void Ex6()
    {
        //Write a program to iterate the HashMap
        HashMap<Integer, String> Map = new HashMap<Integer, String>();
        Map.put(1, "Diana");
        Map.put(2, "George");
        Map.put(3, "Catalin");
        System.out.print("Iteration by keys: ");
        for ( Integer i : Map.keySet())
        {
            System.out.print(i + "\t");
        }
        System.out.print("\nIteration by values: ");
        for ( String i : Map.values())
        {
            System.out.print(i + "\t");
        }
    }

    public static void Ex7()
    { 
        //Write a program to sort ArrayList using Comparable and Comparator

        class Students
        {
            String name;
            int code;
            float grade;
            Students(String name, int code, float grade)
            {
                this.name= name;
                this.code = code;
                this.grade= grade;
            }
        }
        class GradeComparator implements Comparator<Students> {
            public int compare(Students s1, Students s2)
            {
                if (s1.grade == s2.grade)
                    return 0;
                else if (s1.grade > s2.grade)
                    return 1;
                else
                    return -1;
            }
        }
        class NameComparator implements Comparator<Students> {
            public int compare(Students s1, Students s2)
            {
                return s1.name.compareTo(s2.name);
            }
        }
        ArrayList<Students> List = new ArrayList<>();
        List.add(new Students("Vlad",330192,6.88f));
        List.add(new Students("George", 330221, 5.84f));
        List.add(new Students("Ana",221633, 8.32f));
        System.out.println("List before sorting:");
            for (Students student : List)
            {
                System.out.println(student.name + " " + student.code + " " + student.grade);
            }
        System.out.println("List after sorting ( Grade ) :");
        List.sort(new GradeComparator());
        for (Students student : List)
        {
            System.out.println(student.name + " " + student.code + " " + student.grade);
        }
        System.out.println("List after sorting ( Name ) :");
        List.sort(new NameComparator());
        for (Students student : List)
        {
            System.out.println(student.name + " " + student.code + " " + student.grade);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose the excercise (1-7) ( 0 = exit ): ");
        int opt = scan.nextInt();
        do
        {
            System.out.println("You chose exercise "+ opt);
        switch(opt)
                {
                    case 1: {
                        Ex1();
                        break;
                    }
                    case 2: {
                        Ex2();
                        break;
                    }
                    case 3: {
                        Ex3();
                        break;
                    }
                    case 4: {
                        Ex4();
                        break;
                    }
                    case 5: {
                        Ex5();
                        break;
                    }
                    case 6: {
                        Ex6();
                        break;
                    }
                    case 7: {
                        Ex7();
                        break;
                    }
                }
            System.out.print("\nChoose the excercise (1-7) ( 0 = exit ): ");
            opt = scan.nextInt();
        } while(opt!=0);
    }
}
