
import java.util.*;

class Numbers
{
  public void EvenFactorDisplay(int iValue)
  {
    int iCnt=0 ;
    for(iCnt=2;iCnt<=(iValue/2);iCnt+=2)
    {
        if((iValue %iCnt )==0)
        {
           
             System.out.println("Even factors are:"+iCnt);

            
        }
    }

  }

}

class program253
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