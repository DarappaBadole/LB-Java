// common factors between two numbers
 
import java.util.*;

class Numbers
{
  public void CommonFactorDisplay(int iNo1,int iNo2)
  {
    int iCnt=0 ;
    for(iCnt=1;iCnt<=(iNo1/2) && iCnt<=(iNo2/2);iCnt++)
    {
        if(((iNo1 % iCnt)==0)&&(iNo2 % iCnt==0))
        {
            System.out.println(iCnt);
        }

    }
    

  }

}

class program254
{

 public static void main(String arr[])
 {
   Scanner sobj = new Scanner(System.in);

   System.out.println("Please Enter first  Number:");
   int iNo1 = sobj.nextInt();

    System.out.println("Please Enter second  Number:");
   int iNo2 = sobj.nextInt();

   Numbers nobj = new Numbers();
   nobj.CommonFactorDisplay(iNo1,iNo2);

  



 }


}