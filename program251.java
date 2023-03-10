//  Template for problems on numbers Even Factors

import java.util.*;

class Numbers
{
  public void EvenFactorDisplay(int iValue)
  {
    int iCnt=0 ;
    for(iCnt=1;iCnt<=(iValue/2);iCnt++)
    {
        if((iValue %iCnt )==0)
        {
            if((iCnt %2 )==0)
            {

             System.out.println(+iCnt);

            }
        }
    }



  }

}

class program251
{

 public static void main(String arr[])
 {
   Scanner sobj = new Scanner(System.in);

   System.out.println("Please Enter Numer:");
   int iNo = sobj.nextInt();

   Numbers nobj = new Numbers();
   nobj.EvenFactorDisplay(iNo);

  



 }


}