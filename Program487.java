import java.util.*;

class Program487
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        String data = str.replaceAll("\\s+"," ");

        String newstr = str.trim();

       String Arr[] = newstr.split(" ");
       System.out.println("Number of words are :"+ Arr.length);


    }
}