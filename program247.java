import java.util.*;

class program247
{
 
 static int Addition(int i, int j)
 {
    int Sum=0;
    Sum=i+j;

    return Sum;
 }

 public static void main(String arr[])
 {
  
  Scanner sobj = new Scanner(System.in);
  
  System.out.println("Enter First NUmber:");
  int iNo1= 0 , iNo2=0 , iAns=0;

  iNo1 =sobj.nextInt();

  System.out.println("Enter second NUmber:");
  iNo2 =sobj.nextInt();

  iAns=Addition(iNo1,iNo2);


  System.out.println("Addition is"+iAns);


 }

}