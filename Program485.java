import java.util.*;

class Program485
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

       String Arr[] = str.split(" ");
       System.out.println("Number of words are :"+ Arr.length);


    }
}